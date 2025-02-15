package com.example.cryptosocket.data.repository

import com.example.cryptosocket.data.model.dto.SocketRequest
import com.example.cryptosocket.data.source.remote.websocket.WebSocketService
import com.example.cryptosocket.data.source.remote.websocket.WebSocketState
import com.example.cryptosocket.domain.repository.WebSocketRepository
import com.example.cryptosocket.util.cryptoAssets
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WebSocketRepositoryImpl @Inject constructor(
    private val webSocketService: WebSocketService
) : WebSocketRepository {

    override val messages: StateFlow<WebSocketState> = webSocketService.messageFlow

    override fun startWebSocket() {
        try {
            val initMessage = SocketRequest(id = 3,
                method = "lastprice_subscribe",
                params = cryptoAssets.map { it.symbol + "_USDT" })
            webSocketService.connectWebSocket("wss://api.whitebit.com/ws", initMessage)
        } catch (e: Exception) {
            // Log the error or handle it appropriately
            println("WebSocket connection failed: ${e.message}")
        }
    }

    override fun sendMessage(message: SocketRequest) {
        try {
            webSocketService.sendMessage(message)
        } catch (e: Exception) {
            // Log the error or handle it appropriately
            println("Failed to send WebSocket message: ${e.message}")
        }
    }

    override fun closeConnection() {
        try {
            webSocketService.closeWebSocket()
        } catch (e: Exception) {
            // Log the error or handle it appropriately
            println("Failed to close WebSocket connection: ${e.message}")
        }
    }

    override fun disconnectWebSocket() {
        try {
            webSocketService.closeWebSocket()
        } catch (e: Exception) {
            // Log the error or handle it appropriately
            println("Failed to disconnect WebSocket: ${e.message}")
        }
    }
}