package com.example.cryptoapp.data.source.remote.websocket

import com.example.cryptoapp.data.model.dto.SocketResponse
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import okhttp3.Response
import okhttp3.WebSocket
import okhttp3.WebSocketListener
import okio.EOFException
import timber.log.Timber

class CryptoWebSocketListener(
    private val messageFlow: MutableStateFlow<WebSocketState>
) : WebSocketListener() {

    override fun onOpen(webSocket: WebSocket, response: Response) {
        messageFlow.value = WebSocketState.Connected
        Timber.d("WebSocket connected")
        // No need to send the init message here. Handle it in WebSocketServiceImpl.
    }

    override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
        if (t is EOFException) {
            Timber.d("WebSocket EOFException")
            messageFlow.value = WebSocketState.Disconnected
        } else {
            Timber.e(t, "WebSocket error")
            messageFlow.value = WebSocketState.Error("Error: ${t.message}")
        }
    }

    override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
        Timber.d("WebSocket closing: $code - $reason")
        messageFlow.value = WebSocketState.Disconnected
        webSocket.close(1000, null)
    }

    override fun onMessage(webSocket: WebSocket, text: String) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val message = Gson().fromJson(text, SocketResponse::class.java)
                messageFlow.value = WebSocketState.MessageReceived(message)
                Timber.tag("WebSocket").d("Received: ${message.params} $webSocket")
            } catch (e: Exception) {
                Timber.e(e, "Error parsing message")
                messageFlow.value = WebSocketState.Error("Error parsing message: ${e.message}")
            }
        }
    }
}