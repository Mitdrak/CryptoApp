package com.example.cryptoapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
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
    
    @Query("UPDATE crypto_assets SET price = :price WHERE symbol = :symbol")
    suspend fun updateCryptoAssetPrice(symbol: String, price: Double)

    @Query("DELETE FROM crypto_assets")
    suspend fun deleteAllCryptoAssets()
}