package com.example.cryptoapp.data.repository

import com.example.cryptoapp.data.model.dto.SocketRequest
import com.example.cryptoapp.data.model.dto.SocketResponse
import com.example.cryptoapp.data.remote.api.WebSocketClient
import com.example.cryptoapp.data.remote.listener.MyWebSocketListener
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class WebSocketRepository @Inject constructor(
    private val webSocketService: WebSocketClient
) {
    val messages: StateFlow<SocketResponse?> = webSocketService.messageFlow // ✅ Expose Flow

    fun startWebSocket() {
        val initMessage = """{"event": "subscribe", "channel": "trades"}""" // ✅ Modify for Whitebit API
        webSocketService.connectWebSocket("wss://api.whitebit.com/ws", initMessage)
    }

    fun sendMessage(message: SocketRequest){
        webSocketService.sendMessage(message)
    }
    fun closeConnection(){
        webSocketService.closeWebSocket()
    }
}