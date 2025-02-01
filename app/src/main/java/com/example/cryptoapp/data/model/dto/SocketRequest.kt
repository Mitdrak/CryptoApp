package com.example.cryptoapp.data.model.dto

data class SocketRequest(
    val id: Int,
    val method: String,
    val params: List<Any>
)