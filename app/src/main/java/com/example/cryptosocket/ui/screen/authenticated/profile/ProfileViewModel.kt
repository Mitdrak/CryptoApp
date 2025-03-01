package com.example.cryptosocket.ui.screen.authenticated.profile

import androidx.core.net.toUri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptosocket.domain.models.UserData
import com.example.cryptosocket.domain.repository.UserRepository
import com.example.cryptosocket.ui.screen.authenticated.profile.state.ProfileState
import com.example.cryptosocket.ui.screen.authenticated.profile.state.ProfileUiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject


@HiltViewModel
class ProfileViewModel @Inject constructor(private val userRepository: UserRepository) : ViewModel
    () {
    val _userData: StateFlow<UserData?> = userRepository.userData.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5000),
        null
    )
    var userData: StateFlow<UserData?> = _userData
    val _uiState = MutableStateFlow(ProfileState())
    val uiState: StateFlow<ProfileState> = _uiState

    init {
        viewModelScope.launch {
            userData.collect { user ->
                _uiState.value = _uiState.value.copy(
                    name = user?.name ?: "",
                    email = user?.email ?: "",
                    imageUri = user?.photoUrl ?: "",
                    imageUrl = user?.photoUrl ?: ""
                )
            }
        }
    }

    fun onUiEvent(uiEvent: ProfileUiEvent) {
        when (uiEvent) {
            is ProfileUiEvent.NameChanged -> {
                _uiState.value = _uiState.value.copy(name = uiEvent.inputValue)
            }

            is ProfileUiEvent.EmailChanged -> {
                _uiState.value = _uiState.value.copy(email = uiEvent.inputValue)
            }

            is ProfileUiEvent.ImageChanged -> {
                /*_uiState.value = _uiState.value.copy(imageUrl = uiEvent.inputValue)*/
            }

            is ProfileUiEvent.ImageUriChanged -> {
                _uiState.value = _uiState.value.copy(imageUri = uiEvent.inputValue)
            }

            is ProfileUiEvent.UpdateProfile -> {
                if (_uiState.value.isUpdatingProfile == true) {
                    try {
                        viewModelScope.launch {
                            val isUpdated = userRepository.updateName(_uiState.value.name)
                            val isPhotoUpdated =
                                userRepository.updatePhotoUrl(_uiState.value.imageUri.toUri())
                            if (isUpdated && isPhotoUpdated) {
                                _uiState.value = _uiState.value.copy(isUpdatingProfile = false)
                                Timber.d("Profile updated")
                            } else {
                                Timber.e("Error updating profile")
                                _uiState.value = _uiState.value.copy(isUpdatingProfile = false)
                            }
                        }
                    } catch (e: Exception) {
                        _uiState.value = _uiState.value.copy(isUpdatingProfile = false)
                    }
                    _uiState.value = _uiState.value.copy(isUpdatingProfile = false)
                } else {
                    _uiState.value = _uiState.value.copy(isUpdatingProfile = true)
                }
            }
        }
    }


}