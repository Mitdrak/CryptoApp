package com.example.cryptosocket.data.source.remote.websocket

import com.example.cryptosocket.data.model.dto.SocketRequest
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.WebSocket
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton


interface WebSocketService {
    val messageFlow: StateFlow<WebSocketState>
    fun connectWebSocket(url: String, initMessage: SocketRequest)
    fun sendMessage(message: SocketRequest)
    fun closeWebSocket()
    fun disconnectWebSocket()
}

@Singleton
class WebSocketServiceImpl @Inject constructor(
    private val client: OkHttpClient
) : WebSocketService {
    private var webSocket: WebSocket? = null
    private val gson = Gson()

    private val _messageFlow =
        MutableStateFlow<WebSocketState>(WebSocketState.Disconnected)// ✅ List instead of
    override val messageFlow: StateFlow<WebSocketState> = _messageFlow.asStateFlow()

    private var reconnectAttempts = 0
    private val maxReconnectAttempts = 5
    private val reconnectDelay = 5000L // 5 seconds

    override fun connectWebSocket(url: String, initMessage: SocketRequest) {
        val request = Request.Builder().url(url).build()
        val listener = CryptoWebSocketListener(_messageFlow) // Use the separate listener class

        webSocket = client.newWebSocket(request, listener)
        sendMessage(initMessage) // Send the init message *after* establishing the connection
    }

    private fun attemptReconnect(url: String, initMessage: SocketRequest) {
        if (reconnectAttempts < maxReconnectAttempts) {
            reconnectAttempts++
            CoroutineScope(Dispatchers.IO).launch {
                delay(reconnectDelay)
                Timber.tag("WebSocket").d("Reconnecting attempt $reconnectAttempts")
                connectWebSocket(url, initMessage)
            }
        } else {
            Timber.tag("WebSocket").e("Max reconnect attempts reached")
        }
    }

    override fun sendMessage(message: SocketRequest) {
        val jsonMessage = gson.toJson(message)
        webSocket?.send(jsonMessage)
    }

    override fun closeWebSocket() {
        webSocket?.close(1000, "Closing")

/*
        webSocket = null
*/
    }


    override fun disconnectWebSocket() {
        webSocket?.cancel(
        )
/*
        webSocket = null
*/
    }
}