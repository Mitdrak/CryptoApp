package com.example.cryptoapp.ui.screen.unauthenticated.login.state

data class LoginState(
    val emailOrMobile: String = "",
    val password: String = "",
    val errorState: LoginErrorState = LoginErrorState(),
    val isLoginSuccessful: Boolean = false
)
data class LoginErrorState(
    val emailOrMobileErrorState: ErrorState = ErrorState(),
    val passwordErrorState: ErrorState = ErrorState(),
    val generalErrorState: ErrorState = ErrorState(),
    var emptyFieldErrorState: ErrorState = ErrorState()
)

data class ErrorState(
    var hasError: Boolean = false,
    val errorMessageStringResource: Int = 0,
    var errorMessage: String = ""
)
