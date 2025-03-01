package com.example.cryptosocket.domain.repository

import android.net.Uri
import com.example.cryptosocket.data.source.local.dataStore.DataStoreManager
import com.example.cryptosocket.domain.models.UserData
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import com.google.firebase.auth.userProfileChangeRequest
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    val userData: Flow<UserData?>
    suspend fun updateName(name: String): Boolean
    suspend fun updateEmail(email: String): Boolean
    suspend fun updatePhotoUrl(newPhotoUri: Uri): Boolean
    suspend fun updatePassword(password: String): Boolean
    suspend fun saveUserData(userData: UserData)
    suspend fun clearUserData()
}

@Singleton
class UserRepositoryImpl @Inject constructor(
    private val dataStoreManager: DataStoreManager, private val firebaseAuth: FirebaseAuth,
) :
    UserRepository {

    override val userData: Flow<UserData?> = dataStoreManager.userData

    override suspend fun updateName(name: String): Boolean {
        return try {
            val user = firebaseAuth.currentUser
            user!!.updateProfile(userProfileChangeRequest {
                displayName = name
            }).addOnCompleteListener {
                if (it.isSuccessful) {
                    println("User updated")
                    if (user != null) {
                        println("User: ${user.displayName}")
                    }
                    true
                } else {
                    println("User not updated")
                    false
                }
            }.await()
            dataStoreManager.saveUserName(user.displayName!!)
            true
        } catch (e: Exception) {
            false
        }
    }


    override suspend fun updateEmail(email: String): Boolean {
        return try {
            val user = firebaseAuth.currentUser
            user!!.updateEmail(email).addOnCompleteListener {
                when {
                    it.isSuccessful -> {
                        println("User email updated")
                        if (user != null) {
                            println("User: ${user.email}")
                        }
                    }

                    it.isCanceled -> {
                        println("User email update cancelled")
                    }

                    it.isComplete -> {
                        println("User email update complete")
                    }

                    else -> {
                        println("User email not updated")
                    }
                }
            }.await()
            dataStoreManager.saveUserEmail(user.email!!)
            true
        } catch (e: Exception) {
            false
        }
    }

    override suspend fun updatePhotoUrl(newPhotoUri: Uri): Boolean {
        return try {
            val user = firebaseAuth.currentUser
            user!!.updateProfile(UserProfileChangeRequest.Builder().apply {
                photoUri = newPhotoUri
            }.build()).addOnCompleteListener {
                if (it.isSuccessful) {
                    println("User photo updated")
                    if (user != null) {
                        println("User: ${user.photoUrl}")
                    }
                } else {
                    println("User photo not updated")
                }
            }.await()
            true
        } catch (e: Exception) {
            false
        }
    }

    override suspend fun updatePassword(password: String): Boolean {
        return try {
            val user = firebaseAuth.currentUser
            user!!.updateProfile(UserProfileChangeRequest.Builder().apply {
                photoUri = null
            }.build())
            true
        } catch (e: Exception) {
            false
        }
    }


    override suspend fun saveUserData(userData: UserData) {
        TODO()
    }

    override suspend fun clearUserData() {
        dataStoreManager.clearGoogleCredentials()
    }
}