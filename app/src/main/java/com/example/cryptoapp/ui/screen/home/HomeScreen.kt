package com.example.cryptoapp.ui.screen.home

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.cryptoapp.data.model.dto.CryptoAsset
import com.example.cryptoapp.data.model.dto.SocketResponse
import kotlinx.coroutines.delay


@Composable
fun HomeScreen(navController: NavController, viewModel: HomeViewModel = hiltViewModel()) {
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
        }

    }

}

@Composable
fun MessageItem(message: CryptoAsset) {
    var previousPrice by remember { mutableStateOf(message.price) }
    var highlightColor by remember { mutableStateOf(Color(0xFF535353)) }

    LaunchedEffect(message.price) {
        highlightColor = when {
            message.price > previousPrice -> Color(0xFF006D00)
            message.price < previousPrice -> Color(0xFF840000)
            else -> Color(0xFF535353)
        }
        previousPrice = message.price
        delay(1000) // Wait 1 second before resetting the color
        highlightColor = Color.White
    }

    val animatedColor by animateColorAsState(
        targetValue = highlightColor, animationSpec = tween(durationMillis = 500)
    )
    Card(
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(
            animatedColor
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = message.name,
                style = MaterialTheme.typography.titleMedium,
                color = Color.Black
            )
            Text(
                text = "Price: $${message.price}",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Black
            )

        }
    }
}