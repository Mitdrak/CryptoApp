package com.example.cryptoapp.data.source.remote.websocket

import com.example.cryptoapp.data.model.dto.SocketResponse

sealed class WebSocketState {
    object Connected : WebSocketState()
    object Disconnected : WebSocketState()
    data class Error(val message: String) : WebSocketState()
    data class MessageReceived(val message: SocketResponse) : WebSocketState()
}