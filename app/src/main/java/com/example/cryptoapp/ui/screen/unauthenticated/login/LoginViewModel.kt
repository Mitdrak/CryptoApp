package com.example.cryptoapp.ui.screen.unauthenticated.login

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptoapp.domain.repository.AuthRepository
import com.example.cryptoapp.domain.usecases.auth.GetCurrentUserUseCase
import com.example.cryptoapp.domain.usecases.auth.SignInUseCase
import com.example.cryptoapp.ui.screen.unauthenticated.login.state.LoginState
import com.example.cryptoapp.ui.screen.unauthenticated.login.state.LoginUiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor(
    private val getCurrentUserUseCase: GetCurrentUserUseCase,
    private val signInUseCase: SignInUseCase,
) : ViewModel() {
    var loginState = mutableStateOf(LoginState())
    private val _isLoggedIn = MutableStateFlow<Boolean?>(null)
    val isLoggedIn = _isLoggedIn.asStateFlow()


    init {
        checkIfUserIsLoggedIn()
    }

    private fun checkIfUserIsLoggedIn() {
        viewModelScope.launch {
            val currentUser = getCurrentUserUseCase()
            _isLoggedIn.value = currentUser != null
        }
    }

    fun signIn() {
        viewModelScope.launch {
            val response = signInUseCase(loginState.value.emailOrMobile, loginState.value.password)
            if (response) {
                loginState.value = loginState.value.copy(isLoginSuccessful = true)
            } else {
                println("Login failed")
            }
        }
    }

    fun onUiEvent(loginUiEvent: LoginUiEvent) {
        when (loginUiEvent) {
            is LoginUiEvent.EmailOrMobileChanged -> {
                loginState.value = loginState.value.copy(
                    emailOrMobile = loginUiEvent.inputValue
                )
            }

            is LoginUiEvent.PasswordChanged -> {
                loginState.value = loginState.value.copy(
                    password = loginUiEvent.inputValue
                )
            }

            LoginUiEvent.Submit -> TODO()
        }

    }


}