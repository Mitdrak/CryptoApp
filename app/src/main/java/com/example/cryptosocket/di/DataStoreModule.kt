package com.example.cryptosocket.di

import android.content.Context
import com.example.cryptosocket.data.source.local.dataStore.DataStoreManager
import com.example.cryptosocket.domain.repository.UserRepository
import com.example.cryptosocket.domain.repository.UserRepositoryImpl
import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {
    @Provides
    @Singleton
    fun provideDataStoreManager(@ApplicationContext context: Context): DataStoreManager {
        return DataStoreManager(context)
    }

    @Provides
    @Singleton
    fun provideUserRepository(
        dataStoreManager: DataStoreManager,
        firebaseAuth: FirebaseAuth
    ): UserRepository {
        return UserRepositoryImpl(dataStoreManager, firebaseAuth)
    }
}