package com.example.cryptoapp.domain.usecases.auth

import com.example.cryptoapp.domain.repository.AuthRepository
import com.google.firebase.auth.FirebaseUser
import javax.inject.Inject

class GetCurrentUserUseCase @Inject constructor(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(): FirebaseUser? {
        return repository.getCurrentUser()
    }
}