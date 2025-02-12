package com.example.cryptoapp.data.source.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import com.example.cryptoapp.data.model.entity.CryptoAssetEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface CryptoAssetDao {
    @Query("SELECT * FROM crypto_assets")
    fun getAllCryptoAssets(): Flow<List<CryptoAssetEntity>>

    @Query("SELECT COUNT(*) FROM crypto_assets")
    suspend fun getCryptoAssetsCount(): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdateCryptoAssets(assets: List<CryptoAssetEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdateCryptoAsset(asset: CryptoAssetEntity)

    @Transaction
    suspend fun updateCryptoAssetPrices(updates: Map<String, Double>) {
        for ((symbol, price) in updates) {
            updateCryptoAssetPrice(symbol, price)
        }
    }

    @Query("UPDATE crypto_assets SET price = :price WHERE symbol = :symbol")
    suspend fun updateCryptoAssetPrice(symbol: String, price: Double)

    @Query("SELECT * FROM crypto_assets WHERE symbol = :symbol")
    suspend fun getCryptoAssetBySymbol(symbol: String): CryptoAssetEntity?

    @Update
    suspend fun updateCryptoAsset(asset: CryptoAssetEntity)

    @Query("DELETE FROM crypto_assets")
    suspend fun deleteAllCryptoAssets()
}