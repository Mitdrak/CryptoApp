package com.example.cryptoapp.data.source.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.cryptoapp.data.source.local.dao.CryptoAssetDao
import com.example.cryptoapp.data.model.dto.CryptoAsset
import com.example.cryptoapp.data.model.entity.CryptoAssetEntity


@Database(entities = [CryptoAssetEntity::class], version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase() {
    abstract fun cryptoAssetDao(): CryptoAssetDao

    companion object {
        @Volatile
        private var INSTANCE: AppDataBase? = null
        fun getDatabase(context: Context): AppDataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext, AppDataBase::class.java, "crypto_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }

}