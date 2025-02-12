package com.example.cryptoapp.domain.repository

import com.example.cryptoapp.data.model.dto.SocketRequest
import com.example.cryptoapp.data.model.dto.SocketResponse
import com.example.cryptoapp.data.source.remote.websocket.WebSocketState
import kotlinx.coroutines.flow.StateFlow



interface WebSocketRepository {
    val messages: StateFlow<WebSocketState>

    fun startWebSocket()
    fun sendMessage(message: SocketRequest)
    fun closeConnection()
    fun disconnectWebSocket()
}
