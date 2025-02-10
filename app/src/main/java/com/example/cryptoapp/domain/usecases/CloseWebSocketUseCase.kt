package com.example.cryptoapp.domain.usecases

import com.example.cryptoapp.domain.repository.WebSocketRepository
import javax.inject.Inject

class CloseWebSocketUseCase @Inject constructor(
    private val repository: WebSocketRepository
) {
    operator fun invoke() {
        repository.closeConnection()
    }
}