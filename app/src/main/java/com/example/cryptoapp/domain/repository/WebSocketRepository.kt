package com.example.cryptoapp.domain.repository

import com.example.cryptoapp.data.model.dto.SocketRequest
import com.example.cryptoapp.data.model.dto.SocketResponse
import kotlinx.coroutines.flow.StateFlow



interface WebSocketRepository {
    val messages: StateFlow<SocketResponse?>

    fun startWebSocket()
    fun sendMessage(message: SocketRequest)
    fun closeConnection()
    fun disconnectWebSocket()
}
