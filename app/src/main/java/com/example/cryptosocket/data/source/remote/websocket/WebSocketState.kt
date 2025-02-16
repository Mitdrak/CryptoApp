package com.example.cryptosocket.data.source.remote.websocket

import com.example.cryptosocket.data.model.dto.SocketResponse

sealed class WebSocketState {
    object Connected : WebSocketState()
    object Connecting : WebSocketState()
    object Disconnected : WebSocketState()
    object Disconnecting : WebSocketState()
    data class Error(val message: String) : WebSocketState()
    data class MessageReceived(val message: SocketResponse) : WebSocketState()
}