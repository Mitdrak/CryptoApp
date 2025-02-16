package com.example.cryptoapp.di

import android.content.Context
import androidx.room.Room
import com.example.cryptoapp.data.source.local.AppDataBase
import com.example.cryptoapp.data.source.local.dao.CryptoAssetDao
import com.example.cryptoapp.domain.repository.LocalCryptoRepository
import com.example.cryptoapp.domain.repository.LocalCryptoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {


    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDataBase = Room.databaseBuilder(
        context, AppDataBase::class.java, "crypto_database"
    ).build()

    @Provides
    fun provideCryptoAssetDao(dataBase: AppDataBase): CryptoAssetDao = dataBase.cryptoAssetDao()

    @Provides
    @Singleton
    fun provideLocalCryptoRepository(
        dao: CryptoAssetDao
    ): LocalCryptoRepository {
        return LocalCryptoRepositoryImpl(dao)
    }

}