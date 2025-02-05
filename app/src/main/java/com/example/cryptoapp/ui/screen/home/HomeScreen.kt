package com.example.cryptoapp.ui.screen.home

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.cryptoapp.R
import com.example.cryptoapp.data.model.dto.CryptoAsset
import com.example.cryptoapp.data.model.dto.SocketResponse
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.SwipeRefreshState
import kotlinx.coroutines.delay


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController, viewModel: HomeViewModel = hiltViewModel()) {
    val search by viewModel.searchQuery.collectAsState()
    val filteredCryptoAssets by viewModel.filteredList.collectAsState()
    val isRfreshing by viewModel.isRefreshing.collectAsState()


    Scaffold { innerPadding ->
        SwipeRefresh(state = SwipeRefreshState(isRfreshing),
            onRefresh = { viewModel.retryWebSocketConnection() }) {
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .background(color = Color(21, 21, 21)),
            ) {
                //SearchBar
                TextField(shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedTextColor = Color.Gray,
                        containerColor = Color(14, 14, 14),
                    ),
                    value = search,
                    onValueChange = {
                        viewModel.onSearchQueryChanged(it)
                    },
                    placeholder = { Text("Search", color = Color.Gray) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = null,
                            tint = Color.Gray
                        )
                    },
                    trailingIcon = {
                        if (search.isNotEmpty()) {
                            Button(
                                onClick = {
                                    viewModel.onSearchQueryChanged("")
                                },
                                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.Clear,
                                    contentDescription = null,
                                    tint = Color.Gray
                                )
                            }
                        }
                    })
                LazyColumn {
                    items(filteredCryptoAssets) { asset ->
                        MessageItem(asset)
                    }
                }
            }
        }
    }

}

@Composable
fun MessageItem(message: CryptoAsset) {
    var previousPrice by remember { mutableStateOf(message.price) }
    var highlightColor by remember { mutableStateOf(Color.Gray) }

    LaunchedEffect(message.price) {
        highlightColor = when {
            message.price > previousPrice -> Color(0xFF006D00)
            message.price < previousPrice -> Color(0xFF840000)
            else -> Color.Gray
        }
        previousPrice = message.price
        delay(1000) // Wait 1 second before resetting the color
        highlightColor = Color.Gray
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
            Color(14, 14, 14)
        )
    ) {
        Row(
            modifier = Modifier.padding(5.dp), verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = message.localIcon),
                contentDescription = null,
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = message.name + " (${message.symbol})",
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White
                )
                Text(
                    text = "Price: $${message.price}",
                    style = MaterialTheme.typography.titleMedium,
                    color = animatedColor
                )

            }
        }
    }
}