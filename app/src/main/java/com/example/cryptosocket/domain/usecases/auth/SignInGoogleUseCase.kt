package com.example.cryptosocket.domain.usecases.auth

import android.app.Activity
import com.example.cryptosocket.domain.repository.AuthRepository
import javax.inject.Inject

class SignInGoogleUseCase @Inject constructor(private val repository: AuthRepository) {
    suspend operator fun invoke(activity: Activity): Boolean {
        return repository.signInWithGoogle(activity)
    }
}