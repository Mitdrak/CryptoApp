package com.example.cryptosocket.domain.usecases.socket

import com.example.cryptosocket.domain.repository.WebSocketRepository
import javax.inject.Inject

class CollectWebSocketMessagesUseCase @Inject constructor(private val webSocketRepository: WebSocketRepository) {
    val messages = webSocketRepository.messages
}