package com.example.cryptoapp.domain.repository

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.example.cryptoapp.data.source.local.dao.CryptoAssetDao
import com.example.cryptoapp.data.model.entity.CryptoAssetEntity
import com.example.cryptoapp.data.source.remote.websocket.WebSocketState
import com.example.cryptoapp.util.cryptoAssets
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton


interface LocalCryptoRepository {
    val allCryptoAssets: Flow<List<CryptoAssetEntity>>
    suspend fun checkCryptoAssetsCount(): Int
    suspend fun initializeDatabaseIfEmpty()
    suspend fun updateCryptoPriceFromSocket(response: WebSocketState)
}

@Singleton
class LocalCryptoRepositoryImpl @Inject constructor(
    private val dao: CryptoAssetDao
) : LocalCryptoRepository, LifecycleObserver {

    override val allCryptoAssets: Flow<List<CryptoAssetEntity>> = dao.getAllCryptoAssets()

    private val cache = mutableMapOf<String, Double>() // Map<Symbol, Price>
    private val mutex = Mutex() // To ensure thread-safe access to the cache

    init {
        // Start a coroutine to periodically flush updates
        CoroutineScope(Dispatchers.IO).launch {
            while (true) {
                delay(4000) // Flush every 1 second
                flushCacheToDatabase()
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onAppBackgrounded() {
        CoroutineScope(Dispatchers.IO).launch {
            flushCacheToDatabase() // Flush cache when the app is backgrounded
        }
    }

    override suspend fun checkCryptoAssetsCount(): Int {
        return withContext(Dispatchers.IO) {
            dao.getCryptoAssetsCount()
        }
    }

    override suspend fun initializeDatabaseIfEmpty() {
        withContext(Dispatchers.IO) {
            if (dao.getCryptoAssetsCount() == 0) {
                dao.insertOrUpdateCryptoAssets(cryptoAssets.map {
                    CryptoAssetEntity(
                        symbol = it.symbol,
                        name = it.name,
                        price = it.price,
                        imageUrl = it.idIcon
                    )
                })
                Timber.d("Database initialized with ${cryptoAssets.size} assets")
            }
        }
    }

    override suspend fun updateCryptoPriceFromSocket(response: WebSocketState) {
        withContext(Dispatchers.IO) {
            /*if (checkCryptoAssetsCount() == 0) {
                Timber.w("No data in database")
                return@withContext
            }*/

            // Validate WebSocket response
            if (response !is WebSocketState.MessageReceived) {
                Timber.e("Invalid WebSocket response: ${response}")
                return@withContext
            }

            val message = response.message
            val symbol = message.params.getOrNull(0)?.split("_")?.getOrNull(0)
            val price = message.params.getOrNull(1)?.toDoubleOrNull()

            if (symbol == null || price == null) {
                Timber.e("Invalid WebSocket message format: ${message.params}")
                return@withContext
            }

            // Update the cache
            mutex.withLock {
                cache[symbol] = price
            }
        }
    }

    private suspend fun flushCacheToDatabase() {
        withContext(Dispatchers.IO) {
            mutex.withLock {
                if (cache.isNotEmpty()) {
                    dao.updateCryptoAssetPrices(cache) // Batch update
                    Timber.d("Flushed ${cache.size} updates to the database " + cache)
                    cache.clear()
                }
            }
        }
    }
}