package com.example.cryptosocket.ui.screen.authenticated.profile.state

sealed class ProfileUiEvent {
    data class NameChanged(val inputValue: String) : ProfileUiEvent()
    data class EmailChanged(val inputValue: String) : ProfileUiEvent()
    data class ImageChanged(val inputValue: String) : ProfileUiEvent()
    data class ImageUriChanged(val inputValue: String) : ProfileUiEvent()
    object UpdateProfile : ProfileUiEvent()
}