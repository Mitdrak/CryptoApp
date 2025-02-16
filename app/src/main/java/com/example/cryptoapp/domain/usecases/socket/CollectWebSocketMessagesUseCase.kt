package com.example.cryptoapp.domain.usecases.socket

import com.example.cryptoapp.domain.repository.WebSocketRepository
import javax.inject.Inject

class CollectWebSocketMessagesUseCase @Inject constructor(private val webSocketRepository: WebSocketRepository) {
    val messages = webSocketRepository.messages
}