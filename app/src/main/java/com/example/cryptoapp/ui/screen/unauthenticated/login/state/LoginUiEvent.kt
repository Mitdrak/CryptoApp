package com.example.cryptoapp.ui.screen.unauthenticated.login.state

sealed class LoginUiEvent{
    data class EmailOrMobileChanged(val inputValue: String) : LoginUiEvent()
    data class PasswordChanged(val inputValue: String) : LoginUiEvent()
    object Submit : LoginUiEvent()
}
