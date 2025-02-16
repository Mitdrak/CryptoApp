package com.example.cryptosocket.data.model.dto

data class SocketResponse(
    val id: Int? = null,
    val method: String = "",
    val params: List<String> = emptyList()
) {
    companion object {
        val EMPTY = SocketResponse()
    }
}
