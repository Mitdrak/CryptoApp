package com.example.cryptosocket.domain.repository

import com.example.cryptosocket.data.source.local.dataStore.DataStoreManager
import com.example.cryptosocket.domain.models.UserData
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    val userData: Flow<UserData?>
    suspend fun saveUserData(userData: UserData)
    suspend fun clearUserData()
}

@Singleton
class UserRepositoryImpl @Inject constructor(private val dataStoreManager: DataStoreManager) :
    UserRepository {

    override val userData: Flow<UserData?> = dataStoreManager.userData


    override suspend fun saveUserData(userData: UserData) {
        TODO()
    }

    override suspend fun clearUserData() {
        dataStoreManager.clearGoogleCredentials()
    }
}