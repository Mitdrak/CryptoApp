package com.example.cryptosocket.ui.screen.unauthenticated.login

import android.app.Activity
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptosocket.domain.usecases.auth.GetCurrentUserUseCase
import com.example.cryptosocket.domain.usecases.auth.SignInGoogleUseCase
import com.example.cryptosocket.domain.usecases.auth.SignInUseCase
import com.example.cryptosocket.domain.usecases.auth.SignUpUseCase
import com.example.cryptosocket.ui.screen.unauthenticated.login.state.LoginState
import com.example.cryptosocket.ui.screen.unauthenticated.login.state.LoginUiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor(
    private val getCurrentUserUseCase: GetCurrentUserUseCase,
    private val signInUseCase: SignInUseCase,
    private val signUpUseCase: SignUpUseCase,
    private val signInGoogleUseCase: SignInGoogleUseCase,
) : ViewModel() {
    var loginState = mutableStateOf(LoginState())


    init {
        checkIfUserIsLoggedIn()
    }

    fun resetLoginState() {
        loginState.value = loginState.value.copy(
            isLoading = false,
            isLoginSuccessful = false,
            isSignUpSuccessful = false,
            errorState = LoginState().errorState
        )
    }

    private fun checkIfUserIsLoggedIn() {
        viewModelScope.launch {
            loginState.value = loginState.value.copy(isLoading = true)

            val currentUser = getCurrentUserUseCase()
            loginState.value =
                loginState.value.copy(isLoginSuccessful = currentUser != null, isLoading = false)
        }
    }

    fun signIn() {
        viewModelScope.launch {
            val response = signInUseCase(loginState.value.emailOrMobile, loginState.value.password)
            if (response) {
                loginState.value =
                    loginState.value.copy(isLoginSuccessful = true, isLoading = false)
            } else {
                loginState.value = loginState.value.copy(
                    errorState = loginState.value.errorState.copy(
                        generalErrorState = loginState.value.errorState.generalErrorState.copy(
                            hasError = true,
                            errorMessage = "Login failed"
                        ),
                    ), isLoading = false
                )
                println("Login failed")
            }
        }
    }

    fun signUp() {
        viewModelScope.launch {
            val response = signUpUseCase(loginState.value.emailOrMobile, loginState.value.password)
            if (response.isSuccess) {
                loginState.value =
                    loginState.value.copy(isSignUpSuccessful = true, isLoading = false)
            } else if (response.isFailure) {
                loginState.value = loginState.value.copy(
                    errorState = loginState.value.errorState.copy(
                        generalErrorState = loginState.value.errorState.generalErrorState.copy(
                            hasError = true,
                            errorMessage = response.exceptionOrNull()?.message ?: "Sign up failed"
                        ),
                    ), isLoading = false
                )
                println("SignUp failed")
            }
        }
    }


    fun signInWithGoogle(activity: Activity) {
        viewModelScope.launch {
            loginState.value = loginState.value.copy(isLoading = true)
            val result = signInGoogleUseCase(activity)
            if (result) {
                loginState.value = loginState.value.copy(isLoginSuccessful = true)
            } else {
                println("Sign in with Google failed ViewModel: $result")
                loginState.value = loginState.value.copy(
                    errorState = loginState.value.errorState.copy(
                        generalErrorState = loginState.value.errorState.generalErrorState.copy(
                            hasError = true,
                            errorMessage = "Sign in with Google failed"
                        ),
                    ), isLoading = false
                )
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

            LoginUiEvent.Submit -> {
                loginState.value = loginState.value.copy(isLoading = true)
                if (loginState.value.emailOrMobile.isEmpty() || loginState.value.password.isEmpty()) {
                    loginState.value = loginState.value.copy(
                        errorState = loginState.value.errorState.copy(
                            emptyFieldErrorState = loginState.value.errorState.emptyFieldErrorState.copy(
                                hasError = true,
                                errorMessage = "Please fill in all fields"
                            )
                        ),
                        isLoading = false
                    )
                    return
                } else {
                    signIn()
                }
            }

            LoginUiEvent.SignUp -> {
                loginState.value = loginState.value.copy(isLoading = true)
                if (loginState.value.emailOrMobile.isEmpty() || loginState.value.password.isEmpty()) {
                    loginState.value = loginState.value.copy(
                        errorState = loginState.value.errorState.copy(
                            emptyFieldErrorState = loginState.value.errorState.emptyFieldErrorState.copy(
                                hasError = true,
                                errorMessage = "Please fill in all fields"
                            )
                        ),
                        isLoading = false
                    )
                    return
                } else {
                    signUp()
                }
            }
        }

    }


}