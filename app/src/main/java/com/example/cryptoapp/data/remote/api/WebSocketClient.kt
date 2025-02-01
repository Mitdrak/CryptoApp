package com.example.cryptoapp.data.remote.api

import android.util.Log
import com.example.cryptoapp.data.model.dto.SocketRequest
import com.example.cryptoapp.data.model.dto.SocketResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.emptyFlow
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.WebSocket
import okhttp3.WebSocketListener
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WebSocketClient @Inject constructor(
    private val client: OkHttpClient
) {
    private var webSocket: WebSocket? = null
    private val gson = Gson()

    private val _messageFlow = MutableStateFlow<SocketResponse?>(null)// ✅ List instead of
    val messageFlow: StateFlow<SocketResponse?> = _messageFlow.asStateFlow()

    fun connectWebSocket(url: String, initMessage: String) {
        val request = Request.Builder().url(url).build()
        webSocket = client.newWebSocket(request, object : WebSocketListener() {
            override fun onOpen(webSocket: WebSocket, response: Response) {
                Log.d(
                    "WebSocket",
                    "Connected"
                )/*webSocket.send(initMessage) // ✅ Send init message*/
            }

            override fun onMessage(webSocket: WebSocket, text: String) {
                try {
                    val message = Gson().fromJson(text, SocketResponse::class.java)
                    if (message.id == null) {
                        _messageFlow.value = message // ✅ Emit message to Flow
                    }
                    Log.d("WebSocket", "Received: $message")
                } catch (e: Exception) {
                    Log.e("WebSocket", "Error parsing message: ${e.message}")
                }
            }

            override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
                Log.e("WebSocket", "Error: ${t.message}")
            }

            override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
                Log.d("WebSocket", "Closing: $code - $reason")
                webSocket.close(1000, null)
            }
        })
    }

    fun sendMessage(message: SocketRequest) {
        val jsonMessage = gson.toJson(message)
        webSocket?.send(jsonMessage)
    }

    fun closeWebSocket() {
        webSocket?.close(1000, "Closing connection")
    }
}