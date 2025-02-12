package com.example.cryptoapp.domain.usecases.socket

import com.example.cryptoapp.data.model.dto.SocketRequest
import com.example.cryptoapp.domain.repository.WebSocketRepository
import javax.inject.Inject

class SendWebSocketMessageUseCase @Inject constructor(
    private val repository: WebSocketRepository
) {
    operator fun invoke(message: SocketRequest) {
        repository.sendMessage(message)
    }
}
