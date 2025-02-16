package com.example.cryptosocket.domain.usecases.socket

import com.example.cryptosocket.data.model.dto.SocketRequest
import com.example.cryptosocket.domain.repository.WebSocketRepository
import javax.inject.Inject

class SendWebSocketMessageUseCase @Inject constructor(
    private val repository: WebSocketRepository
) {
    operator fun invoke(message: SocketRequest) {
        repository.sendMessage(message)
    }
}
