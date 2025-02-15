package com.example.cryptosocket.domain.repository

import android.app.Activity
import com.google.firebase.auth.FirebaseUser


interface AuthRepository {
    suspend fun signIn(email: String, password: String): Boolean
    suspend fun signInWithGoogle(activity: Activity): Boolean
    suspend fun signUp(email: String, password: String): Boolean
    suspend fun signOut()
    suspend fun getCurrentUser(): FirebaseUser?
}

