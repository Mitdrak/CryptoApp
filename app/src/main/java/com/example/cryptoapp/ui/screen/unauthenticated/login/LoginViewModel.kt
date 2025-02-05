package com.example.cryptoapp.ui.screen.unauthenticated.login

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptoapp.data.repository.AuthRepository
import com.example.cryptoapp.ui.screen.unauthenticated.login.state.LoginState
import com.example.cryptoapp.ui.screen.unauthenticated.login.state.LoginUiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.math.log


@HiltViewModel
class LoginViewModel @Inject constructor(private val authRepository: AuthRepository) : ViewModel() {
    var loginState = mutableStateOf(LoginState())

    fun signIn() {
        viewModelScope.launch {
            val response = authRepository.signIn(loginState.value.emailOrMobile, loginState.value.password)
            if(response) {
                loginState.value = loginState.value.copy(isLoginSuccessful = true)
            }else{
                println("Login failed")
            }
        }
    }

    fun onUiEvent(loginUiEvent: LoginUiEvent){
        when(loginUiEvent){
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