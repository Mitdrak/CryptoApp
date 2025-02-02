package com.example.cryptoapp.data.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "crypto_assets")
data class CryptoAssetEntity(
    @PrimaryKey val symbol: String,
    val name: String,
    val price: Double,
    val imageUrl: Int
)
