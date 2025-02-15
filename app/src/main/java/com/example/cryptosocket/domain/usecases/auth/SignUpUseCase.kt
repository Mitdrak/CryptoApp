package com.example.cryptosocket.domain.usecases.auth

import com.example.cryptosocket.domain.repository.AuthRepository
import javax.inject.Inject

class SignUpUseCase @Inject constructor(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(email: String, password: String): Boolean {
        return repository.signUp(email, password)
    }
}