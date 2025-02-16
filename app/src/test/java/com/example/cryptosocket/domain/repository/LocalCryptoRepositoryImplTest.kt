package com.example.cryptosocket.domain.repository

import app.cash.turbine.test
import com.example.cryptosocket.data.model.dto.CryptoAsset
import com.example.cryptosocket.data.model.dto.SocketResponse
import com.example.cryptosocket.data.model.entity.CryptoAssetEntity
import com.example.cryptosocket.data.source.remote.websocket.WebSocketState
import com.example.cryptosocket.util.cryptoAssets
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class LocalCryptoRepositoryImplTest {

    private lateinit var repository: LocalCryptoRepositoryImpl
    private lateinit var fakeDao: FakeCryptoAssetDao

    @Before
    fun setUp() {
        fakeDao = FakeCryptoAssetDao()
        repository = LocalCryptoRepositoryImpl(fakeDao)
    }

    @Test
    fun `allCrypto emits correct data`() = runTest {
        val expectedData = listOf(
            CryptoAssetEntity("BTC", "Bitcoin", 45000.0, 1),
            CryptoAssetEntity("ETH", "Ethereum", 3200.0, 1),
        )
        fakeDao.emitFakeData(expectedData)

        repository.allCryptoAssets.test {
            assertEquals(awaitItem(),expectedData)
            cancelAndIgnoreRemainingEvents()
        }

    }
    @Test
    fun `database initializes when empty`() = runTest {
        fakeDao.setCryptoAssetCount(0) // Fake empty database

        repository.initializeDatabaseIfEmpty()
        lateinit var flowResult: List<CryptoAsset>
        fakeDao.getAllCryptoAssets().collect() {
            flowResult = it.map { CryptoAsset(it.name, it.symbol, it.price, it.imageUrl) }
        }

        assertEquals(fakeDao.getCryptoAssetsCount(), cryptoAssets.size) // Should insert all assets
    }

    @Test
    fun `WebSocket price update updates cache`() = runTest {
        val response = WebSocketState.MessageReceived(
            SocketResponse(null,"",params = listOf("BTC_USDT", "46000.0"))
        )

        repository.updateCryptoPriceFromSocket(response)
        repository.flushCacheToDatabase()

        // Ensure the cache holds the correct updated price
        assertEquals(fakeDao.getLatestPrice("BTC"), 46000.0)
    }
}