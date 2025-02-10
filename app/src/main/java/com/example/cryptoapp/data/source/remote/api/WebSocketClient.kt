package com.example.cryptoapp.data.source.remote.api

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
import javax.inject.Inject
import javax.inject.Singleton


interface WebSocketClient {
    val messageFlow: StateFlow<SocketResponse?>
    fun connectWebSocket(url: String, initMessage: SocketRequest)
    fun sendMessage(message: SocketRequest)
    fun closeWebSocket()
    fun disconnectWebSocket()
}

@Singleton
class WebSocketClientImpl @Inject constructor(
    private val client: OkHttpClient
): WebSocketClient {
    private var webSocket: WebSocket? = null
    private val gson = Gson()

    private val _messageFlow = MutableStateFlow<SocketResponse?>(null)// ✅ List instead of
    override val messageFlow: StateFlow<SocketResponse?> = _messageFlow.asStateFlow()

    private var reconnectAttempts = 0
    private val maxReconnectAttempts = 5
    private val reconnectDelay = 5000L // 5 seconds

    override fun connectWebSocket(url: String, initMessage: SocketRequest) {
        val request = Request.Builder().url(url).build()
        webSocket = client.newWebSocket(request, object : WebSocketListener() {
            override fun onOpen(webSocket: WebSocket, response: Response) {
                Log.d(
                    "WebSocket", "Connected"
                )/*webSocket.send(initMessage) // ✅ Send init message*/
                println("Init message: $initMessage")
                sendMessage(initMessage) // Send initial message after connection
                reconnectAttempts = 0

            }

            override fun onMessage(webSocket: WebSocket, text: String) {
                CoroutineScope(Dispatchers.IO).launch {
                    try {
                        val message = Gson().fromJson(text, SocketResponse::class.java)
                        if (message.id == null) {
                            _messageFlow.value = message // ✅ Emit message to Flow
                        }
                        Log.d("WebSocket", "Received[$webSocket]: $message")
                    } catch (e: Exception) {
                        Log.e("WebSocket", "Error parsing message: ${e.message}")
                    }
                }
            }

            override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
                Log.e("WebSocket", "Error: ${t}")
                /*attemptReconnect(url, initMessage)*/
            }

            override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
                Log.d("WebSocket", "Closing: $code - $reason")
                webSocket.close(1000, null)
                /*attemptReconnect(url, initMessage)*/
            }
        })
    }

    private fun attemptReconnect(url: String, initMessage: SocketRequest) {
        if (reconnectAttempts < maxReconnectAttempts) {
            reconnectAttempts++
            CoroutineScope(Dispatchers.IO).launch {
                delay(reconnectDelay)
                Log.d("WebSocket", "Reconnecting attempt $reconnectAttempts")
                connectWebSocket(url, initMessage)
            }
        } else {
            Log.e("WebSocket", "Max reconnect attempts reached")
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