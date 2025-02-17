package com.example.cryptosocket.ui.screen.unauthenticated.login

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.cryptosocket.R
import com.example.cryptosocket.ui.screen.unauthenticated.login.state.LoginUiEvent


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(onNavigateToHome: () -> Unit, viewModel: LoginViewModel = hiltViewModel()) {

    val loginState by remember {
        viewModel.loginState
    }
    val context = LocalContext.current
    val activity = context as? Activity ?: return  // ✅ Ensure we pass an Activity
    val snackbarHostState = remember { SnackbarHostState() }

    LaunchedEffect(loginState.errorState) {
        if (loginState.errorState.generalErrorState.hasError) {
            snackbarHostState.showSnackbar("An error occurred: ${loginState.errorState.generalErrorState.errorMessage}")
            viewModel.resetLoginState()
        } else if (loginState.errorState.emptyFieldErrorState.hasError) {
            snackbarHostState.showSnackbar("Please fill all fields")
            viewModel.resetLoginState()
        }
    }
    if (loginState.isLoginSuccessful) {
        onNavigateToHome()
    }

    Scaffold(
        snackbarHost = {
            SnackbarHost(
                hostState = snackbarHostState
            ) {
                Snackbar(
                    snackbarData = it, containerColor = Color.Red, contentColor = Color
                        .White
                )
            }
        },
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .background(Color(23, 24, 26)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Welcome Back!",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Text(
                text = "Please sign in to continue",
                modifier = Modifier.padding(top = 16.dp),
                color = Color(142, 142, 142, 255),
                fontSize = 15.sp
            )
            Spacer(modifier = Modifier.weight(1f))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.Center
            ) {

                OutlinedTextField(
                    value = loginState.emailOrMobile,
                    onValueChange = { viewModel.onUiEvent(LoginUiEvent.EmailOrMobileChanged(it)) },
                    placeholder = { Text("Email") },
                    singleLine = false,
                    modifier = Modifier
                        .padding(horizontal = 25.dp)
                        .border(
                            width = 3.dp,
                            color = Color(34, 37, 44),
                            shape = RoundedCornerShape(25.dp),
                        )
                        .fillMaxWidth(),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedPlaceholderColor = Color(142, 142, 142, 255),
                        containerColor = Color(34, 37, 44),
                        unfocusedLabelColor = Color(173, 173, 173, 255),
                    ),
                    textStyle = TextStyle(color = Color(173, 173, 173, 255)),
                    shape = RoundedCornerShape(25.dp)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                OutlinedTextField(
                    value = loginState.password,
                    onValueChange = { viewModel.onUiEvent(LoginUiEvent.PasswordChanged(it)) },
                    placeholder = { Text("Password") },
                    singleLine = false,
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier
                        .padding(horizontal = 25.dp)
                        .border(
                            width = 3.dp,
                            color = Color(34, 37, 44),
                            shape = RoundedCornerShape(25.dp),
                        )
                        .fillMaxWidth(),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedPlaceholderColor = Color(142, 142, 142, 255),
                        containerColor = Color(34, 37, 44),
                        unfocusedLabelColor = Color(173, 173, 173, 255),
                    ),
                    textStyle = TextStyle(color = Color(173, 173, 173, 255)),
                    shape = RoundedCornerShape(25.dp)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = {
                    viewModel.onUiEvent(LoginUiEvent.Submit)
                },
                modifier = Modifier
                    .padding(horizontal = 80.dp, vertical = 8.dp)
                    .fillMaxWidth()
                    .border(
                        width = 3.dp,
                        color = Color(34, 37, 44),
                        shape = RoundedCornerShape(25.dp),
                    ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (loginState.isLoading) Color.Red else Color(
                        75,
                        93,
                        255
                    ),
                    contentColor = Color.White
                ),
                enabled = !loginState.isLoading
            ) {
                Text("Sign In")
            }
            Button(
                onClick = {

                    viewModel.signInWithGoogle(activity)
                },
                modifier = Modifier
                    .padding(horizontal = 80.dp, vertical = 8.dp)
                    .fillMaxWidth()
                    .border(
                        width = 3.dp,
                        color = Color(34, 37, 44),
                        shape = RoundedCornerShape(25.dp),
                    ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White, contentColor = Color(34, 37, 44)
                ),
                enabled = !loginState.isLoading
            ) {
                Image(
                    painter = painterResource(id = R.drawable.google_icon),
                    contentDescription = "Google",
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .size(24.dp)
                )
                Text("Sign In With Google")
            }
            Button(
                onClick = { },
                modifier = Modifier
                    .padding(horizontal = 80.dp, vertical = 8.dp)
                    .fillMaxWidth()
                    .border(
                        width = 3.dp,
                        color = Color(34, 37, 44),
                        shape = RoundedCornerShape(25.dp),
                    ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(34, 37, 44), contentColor = Color.White
                )
            ) {
                Text("Sign In With Facebook")
            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }


}

