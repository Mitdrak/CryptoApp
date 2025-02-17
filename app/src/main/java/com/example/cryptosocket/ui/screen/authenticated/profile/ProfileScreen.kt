package com.example.cryptosocket.ui.screen.authenticated.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.example.cryptosocket.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(onNavigateToHome: () -> Unit) {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    text = "Profile",
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            },
            navigationIcon = {
                IconButton(onClick = {
                    onNavigateToHome()
                }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription =
                        "Back", tint = Color.White
                    )
                }
            },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = Color(
                    21,
                    21,
                    21
                )
            )
        )
    }) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .background(Color(21, 21, 21))
        ) {
            Spacer(modifier = Modifier.height(32.dp))
            Box(modifier = Modifier.size(100.dp)) { // Same size as the image
                Image(
                    painter = painterResource(R.drawable.bitcoin_btc_logo),
                    contentDescription = "Bitcoin",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize() // Fill the Box
                )


                Box( // The container for the Icon
                    modifier = Modifier
                        .size(34.dp) // Size of the bordered area
                        .clip(CircleShape) // Clip the Box
                        .background(Color.Black) // Background for the Box
                        .align(Alignment.BottomEnd) // Align the Box to the bottom end of the Image
                        .border(1.dp, Color.Black, CircleShape) // Border for the Box
                        .clickable(onClick = { /* Handle edit click */ }),
                    contentAlignment = Alignment.Center // Center the Icon within the Box
                ) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Edit",
                        tint = Color.White,
                        modifier = Modifier
                            .size(24.dp) // Size of the Icon
                            .padding(4.dp) // Padding around the Icon
                    )
                }

            }
            Spacer(modifier = Modifier.height(32.dp))

            OutlinedTextField(
                value = "",
                readOnly = true,
                onValueChange = {},
                placeholder = { Text("Sergio Carriel") },
                colors = OutlinedTextFieldDefaults.colors(unfocusedLabelColor = Color.Gray),
                modifier = Modifier.padding(8.dp),
                singleLine = true
            )
            OutlinedTextField(
                value = "",
                readOnly = true,
                onValueChange = {},
                placeholder = { Text("sergio@example.com") },
                colors = OutlinedTextFieldDefaults.colors(unfocusedLabelColor = Color.Gray),
                modifier = Modifier.padding(8.dp),
                singleLine = true
            )
            OutlinedTextField(
                value = "",
                readOnly = true,
                onValueChange = {},
                placeholder = { Text("******") },
                colors = OutlinedTextFieldDefaults.colors(unfocusedLabelColor = Color.Gray),
                modifier = Modifier.padding(8.dp),
                singleLine = true,
                visualTransformation = PasswordVisualTransformation()
            )
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = { /* Handle sign out click */ },
                modifier = Modifier
                    .padding(horizontal = 80.dp, vertical = 8.dp)
                    .fillMaxWidth()
                    .border(
                        width = 3.dp,
                        color = Color(34, 37, 44),
                        shape = RoundedCornerShape(25.dp),
                    ),
                enabled = true,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(34, 37, 44), contentColor = Color.White
                )
            ) {
                Text("Edit Profile")
            }
            Spacer(modifier = Modifier.weight(1f))


        }
    }
}


