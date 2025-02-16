package com.example.cryptosocket.domain.repository

import com.example.cryptosocket.data.model.entity.CryptoAssetEntity
import com.example.cryptosocket.data.source.local.dao.CryptoAssetDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FakeCryptoAssetDao : CryptoAssetDao {
    private val cryptoList = mutableListOf<CryptoAssetEntity>() // Simulate database
    private val prices = mutableMapOf<String, Double>() // Store updated prices

    override fun getAllCryptoAssets(): Flow<List<CryptoAssetEntity>> = flow {
        emit(cryptoList) // Emit fake database list as Flow
    }

    override suspend fun getCryptoAssetsCount(): Int = cryptoList.size

    override suspend fun insertOrUpdateCryptoAssets(assets: List<CryptoAssetEntity>) {
        assets.forEach { asset ->
            cryptoList.removeIf { it.symbol == asset.symbol } // Remove old entry
            cryptoList.add(asset) // Add new entry
            prices[asset.symbol] = asset.price // Store latest price
        }
    }

    override suspend fun insertOrUpdateCryptoAsset(asset: CryptoAssetEntity) {
        cryptoList.removeIf { it.symbol == asset.symbol }
        cryptoList.add(asset)
        prices[asset.symbol] = asset.price
    }

    override suspend fun updateCryptoAssetPrices(updates: Map<String, Double>) {
        updates.forEach { (symbol, price) ->
            cryptoList.find { it.symbol == symbol }?.let { asset ->
                val updatedAsset = asset.copy(price = price)
                cryptoList.remove(asset)
                cryptoList.add(updatedAsset)
            }
            prices[symbol] = price // Update stored price
        }
    }

    override suspend fun updateCryptoAssetPrice(symbol: String, price: Double) {
        cryptoList.find { it.symbol == symbol }?.let { asset ->
            val updatedAsset = asset.copy(price = price)
            cryptoList.remove(asset)
            cryptoList.add(updatedAsset)
        }
        prices[symbol] = price
    }

    override suspend fun getCryptoAssetBySymbol(symbol: String): CryptoAssetEntity? {
        return cryptoList.find { it.symbol == symbol }
    }

    override suspend fun updateCryptoAsset(asset: CryptoAssetEntity) {
        cryptoList.removeIf { it.symbol == asset.symbol }
        cryptoList.add(asset)
        prices[asset.symbol] = asset.price
    }

    override suspend fun deleteAllCryptoAssets() {
        cryptoList.clear()
        prices.clear()
    }

    // Helper methods for testing
    fun emitFakeData(data: List<CryptoAssetEntity>) {
        cryptoList.clear()
        cryptoList.addAll(data)
    }

    fun setCryptoAssetCount(count: Int) {
        cryptoList.clear()
        repeat(count) {
            cryptoList.add(CryptoAssetEntity("SYM$it", "Crypto $it", 100.0, 1))
        }
    }

    fun getLatestPrice(symbol: String): Double? = prices[symbol]
}
