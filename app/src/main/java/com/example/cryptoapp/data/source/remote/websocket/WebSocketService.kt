package com.example.cryptoapp.data.source.remote.websocket

import android.util.Log
import com.example.cryptoapp.data.model.dto.SocketRequest
import com.example.cryptoapp.data.model.dto.SocketResponse
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
import okhttp3.Response
import okhttp3.WebSocket
import okhttp3.WebSocketListener
import okio.EOFException
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
        webSocket = client.newWebSocket(request, object : WebSocketListener() {
            override fun onOpen(webSocket: WebSocket, response: Response) {
                _messageFlow.value = WebSocketState.Connected // ✅ Emit connected state to Flow
                Timber.d("WebSocket connected")
                println("Init message: $initMessage")
                sendMessage(initMessage) // Send initial message after connection
                reconnectAttempts = 0

            }

            override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
                if (t is EOFException) {
                    Timber.d("WebSocket EOFException")
                    _messageFlow.value = WebSocketState.Disconnected
                } else {
                    Timber.e(t, "WebSocket error")
                    _messageFlow.value = WebSocketState.Error("Error: ${t.message}")
                }
            }

            override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
                Timber.d("WebSocket closing: $code - $reason")
                _messageFlow.value = WebSocketState.Disconnected
                webSocket.close(1000, null)
            }

            override fun onMessage(webSocket: WebSocket, text: String) {
                CoroutineScope(Dispatchers.IO).launch {
                    try {
                        val message = Gson().fromJson(text, SocketResponse::class.java)
                        _messageFlow.value = WebSocketState.MessageReceived(message)
                        Timber.tag("WebSocket").d("Received: ${message.params}")
                    } catch (e: Exception) {
                        Timber.e(e, "Error parsing message")
                        _messageFlow.value =
                            WebSocketState.Error("Error parsing message: ${e.message}")
                    }
                }
            }
        })
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
        webSocket?.close(1000, "Closing connection")
        webSocket = null
    }

    override fun disconnectWebSocket() {
        webSocket?.cancel(
        )
        webSocket = null
    }
}