package com.example.cryptoapp.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.cryptoapp.data.model.dto.CryptoAsset
import com.example.cryptoapp.data.model.dto.SocketResponse


@Composable
fun HomeScreen(navController: NavController, viewModel: HomeViewModel = hiltViewModel()) {
    val name by viewModel.name.collectAsState()
    val surname by viewModel.surname.collectAsState()
    val messages by viewModel.messages.collectAsState()
    val cryptoAssets by viewModel.cryptoAssetsData.collectAsState()

    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = Color(0xFF262626)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            /*Text(text = "$name $surname")
            TextField(value = name, onValueChange = viewModel::changeName)
            TextField(value = surname, onValueChange = viewModel::changeSurName)*/
            Button(onClick = {
                viewModel.connectWebSocket()
            }) { Text(text = "Connect") }
            Button(onClick = {
                viewModel.closeWebSocket()
            }) { Text(text = "Close") }
            Button(onClick = {
                viewModel.sendMessage()
            }) { Text(text = "Send Message") }
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn {
                items(cryptoAssets) { asset ->
                    MessageItem(asset)
                }
            }

            /*LazyColumn(modifier = Modifier.weight(1f)) {
                items(messages) { message ->
                    if (message != null) {
                        MessageItem(message)
                    }
                }
            }*/
        }

    }

}

@Composable
fun MessageItem(message: CryptoAsset) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Crypto: ${message.name}", style = MaterialTheme.typography.titleMedium
            )
            Text(text = "Price: ${message.price}", style = MaterialTheme.typography.titleMedium)

        }
    }
}