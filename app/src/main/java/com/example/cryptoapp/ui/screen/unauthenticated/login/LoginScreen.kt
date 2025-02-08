package com.example.cryptoapp.ui.screen.unauthenticated.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.cryptoapp.ui.navigation.NavigationRoutes
import com.example.cryptoapp.ui.screen.unauthenticated.login.state.LoginState
import com.example.cryptoapp.ui.screen.unauthenticated.login.state.LoginUiEvent


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(onNavigateToHome: () -> Unit, viewModel: LoginViewModel = hiltViewModel()) {

    val loginState by remember {
        viewModel.loginState
    }
    val isLoggedIn by viewModel.isLoggedIn.collectAsState()

    LaunchedEffect(isLoggedIn) {
        if (isLoggedIn == true) {
            onNavigateToHome()
        }
    }
    if (loginState.isLoginSuccessful) {
        onNavigateToHome()
    }
    if (isLoggedIn == null) {
        Box(modifier = Modifier.fillMaxSize()) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    } else if(isLoggedIn == false) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Email", color = Color.White,
                    modifier = Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .padding(16.dp)
                        .width(100.dp), // Fixed width for consistent alignment

                )
                TextField(
                    value = loginState.emailOrMobile,
                    onValueChange = { viewModel.onUiEvent(LoginUiEvent.EmailOrMobileChanged(it)) },
                    label = { Text("Email") },
                    placeholder = { Text("example@domain.com") },
                    isError = !loginState.emailOrMobile.contains("@"), // Simple validation check for '@'
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Password", color = Color.White,
                    modifier = Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .padding(16.dp)
                        .width(100.dp), // Fixed width for consistent alignment
                )
                TextField(
                    value = loginState.password,
                    onValueChange = { viewModel.onUiEvent(LoginUiEvent.PasswordChanged(it)) },
                    label = { Text("Password") },
                    visualTransformation = PasswordVisualTransformation(),
                    placeholder = { Text("*******") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Button(onClick = { viewModel.signIn() }) {
                Text("Sign In")
            }
            Spacer(modifier = Modifier.weight(1f))


        }
    }



}