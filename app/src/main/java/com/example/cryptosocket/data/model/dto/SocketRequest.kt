package com.example.cryptosocket.data.model.dto

data class SocketRequest(
    val id: Int,
    val method: String,
    val params: List<Any>
)