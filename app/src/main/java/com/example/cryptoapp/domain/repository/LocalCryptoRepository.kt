package com.example.cryptoapp.domain.repository

import com.example.cryptoapp.data.source.local.dao.CryptoAssetDao
import com.example.cryptoapp.data.model.dto.SocketResponse
import com.example.cryptoapp.data.model.entity.CryptoAssetEntity
import com.example.cryptoapp.util.cryptoAssets
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalCryptoRepository @Inject constructor(private val dao: CryptoAssetDao) {
    val allCryptoAssets: Flow<List<CryptoAssetEntity>> = dao.getAllCryptoAssets()

    suspend fun checkCryptoAssetsCount(): Int {
        return withContext(Dispatchers.IO) {
            dao.getCryptoAssetsCount()

        }
    }

    suspend fun initialDatabaseIfEmpty() {
        if (dao.getCryptoAssetsCount() == 0) {
            val initalData = cryptoAssets
            initalData.forEach { crypto ->
                dao.insertOrUpdateCryptoAsset(
                    CryptoAssetEntity(
                        symbol = crypto.symbol,
                        name = crypto.name,
                        price = 0.0,
                        imageUrl = crypto.localIcon
                    )
                )
            }
        }
    }

    suspend fun updateCryptoPriceFromSocket(response: SocketResponse) {
        withContext(Dispatchers.IO) {
            if (checkCryptoAssetsCount() == 0) {
                println("No data in database")
            }
            val symbol = response.params[0].split("_")[0]
            val price = response.params[1].toDoubleOrNull() ?: 0.0
            val cryptoAsset = cryptoAssets.find { it.symbol == symbol }
            val entity = cryptoAsset?.let {
                CryptoAssetEntity(
                    symbol = symbol, name = cryptoAsset.name, price = price, imageUrl = it.localIcon
                )
            }
            if (entity != null) {
                dao.updateCryptoAssetPrice(symbol, price)
            }
        }
    }
}