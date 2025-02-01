package com.example.cryptoapp.data.remote.listener

import android.util.Log
import com.example.cryptoapp.data.model.dto.SocketResponse
import com.google.gson.Gson
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import okhttp3.Response
import okhttp3.WebSocket
import okhttp3.WebSocketListener
import org.json.JSONObject
import javax.inject.Inject
import javax.inject.Singleton


class MyWebSocketListener : WebSocketListener() {


    override fun onOpen(webSocket: WebSocket, response: Response) {
        Log.d("WebSocket", "Connected: $response")
    }

    /*override fun onMessage(webSocket: WebSocket, text: String) {
        try {
            val message = Gson().fromJson(text, SocketResponse::class.java)
            _messageFlow.value = message // ✅ Emit message to Flow
            Log.d("WebSocket", "Received: $message")
        } catch (e: Exception) {
            Log.e("WebSocket", "Error parsing message: ${e.message}")
        }
    }*/

    override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
        Log.e("WebSocket", "Error: ${t.message}")
    }

    override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
        Log.d("WebSocket", "Closing: $code - $reason")
        webSocket.close(1000, null)
    }
}