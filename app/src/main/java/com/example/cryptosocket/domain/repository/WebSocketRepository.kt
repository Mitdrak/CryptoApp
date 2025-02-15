package com.example.cryptosocket.domain.repository

import com.example.cryptosocket.data.model.dto.SocketRequest
import com.example.cryptosocket.data.source.remote.websocket.WebSocketState
import kotlinx.coroutines.flow.StateFlow



interface WebSocketRepository {
    val messages: StateFlow<WebSocketState>

    fun startWebSocket()
    fun sendMessage(message: SocketRequest)
    fun closeConnection()
    fun disconnectWebSocket()
}
