package com.example.cryptoapp.domain.usecases.socket

import com.example.cryptoapp.domain.repository.WebSocketRepository
import javax.inject.Inject

class DisconnectWebSocketUseCase @Inject constructor(
    private val repository: WebSocketRepository
) {
    operator fun invoke() {
        repository.disconnectWebSocket()
    }
}