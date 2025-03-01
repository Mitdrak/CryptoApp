package com.example.cryptosocket.ui.screen.authenticated.profile.state

data class ProfileState(
    val name: String = "",
    val email: String = "",
    val imageUrl: String = "",
    val imageUri: String = "",
    val errorState: ProfileErrorState = ProfileErrorState(),
    val isLoading: Boolean = false,
    val isProfileUpdateSuccessful: Boolean = false,
    val isUpdatingProfile: Boolean = false
)

data class ProfileErrorState(
    val nameErrorState: ErrorState = ErrorState(),
    val emailErrorState: ErrorState = ErrorState(),
    val imageErrorState: ErrorState = ErrorState(),
    val generalErrorState: ErrorState = ErrorState(),
    var emptyFieldErrorState: ErrorState = ErrorState()
)

data class ErrorState(
    var hasError: Boolean = false,
    val errorMessageStringResource: Int = 0,
    var errorMessage: String = ""
)