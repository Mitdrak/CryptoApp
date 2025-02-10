package com.example.cryptoapp.domain.usecases

import com.example.cryptoapp.data.model.dto.SocketRequest
import com.example.cryptoapp.domain.repository.WebSocketRepository
import javax.inject.Inject

class StartWebSocketUseCase @Inject constructor(
    private val repository: WebSocketRepository
) {
    operator fun invoke() {
        repository.startWebSocket()
    }
}