package com.example.cryptosocket.domain.usecases.socket

import com.example.cryptosocket.domain.repository.WebSocketRepository
import javax.inject.Inject

class CloseWebSocketUseCase @Inject constructor(
    private val repository: WebSocketRepository
) {
    operator fun invoke() {
        repository.closeConnection()
    }
}