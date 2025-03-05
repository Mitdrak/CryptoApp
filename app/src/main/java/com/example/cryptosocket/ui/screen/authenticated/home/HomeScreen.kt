package com.example.cryptosocket.ui.screen.authenticated.home

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil3.compose.AsyncImage
import com.example.cryptosocket.R
import com.example.cryptosocket.data.model.dto.CryptoAsset
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.SwipeRefreshState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onNavigateToLogin: () -> Unit, onNavigateToProfile: () -> Unit, viewModel:
    HomeViewModel =
        hiltViewModel
            ()
) {
    val search by viewModel.searchQuery.collectAsState()
    val filteredCryptoAssets by viewModel.filteredList.collectAsState()
    val isRfreshing by viewModel.isRefreshing.collectAsState()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val signOutState by viewModel.signOutState.collectAsState()
    val userData by viewModel.userData.collectAsState()

    LaunchedEffect(signOutState) {
        if (signOutState) {
            onNavigateToLogin()
        }
    }

    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet(
                drawerContainerColor = Color(21, 21, 21),
            ) {
                Column(
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    Row(modifier = Modifier.padding(8.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.bitcoin_btc_logo),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.size(50.dp)
                        )
                        Text(
                            text = userData?.name ?: "User",
                            modifier = Modifier.padding(16.dp),
                            style = MaterialTheme.typography.titleLarge,
                            color = Color.White
                        )
                    }
                    HorizontalDivider()
                    NavigationDrawerItem(label = {
                        Text(
                            "Edit profile",
                            color = Color.White,
                            style = MaterialTheme.typography.titleMedium
                        )
                    },
                        colors = NavigationDrawerItemDefaults.colors(unselectedContainerColor = Color.Transparent),
                        selected = false,
                        onClick = {
                            viewModel.closeWebSocket()
                            onNavigateToProfile()
                        })

                    NavigationDrawerItem(label = {
                        Text(
                            "Sign Out",
                            color = Color.White,
                            style = MaterialTheme.typography.titleMedium
                        )
                    },
                        colors = NavigationDrawerItemDefaults.colors(unselectedContainerColor = Color.Transparent),
                        selected = false,
                        onClick = {
                            viewModel.signOut()
                        })

                }
            }
        },
        drawerState = drawerState,
    ) {
        Scaffold(topBar = {
            CenterAlignedTopAppBar(title = {
                Text(
                    text = "Menu",
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }, colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = Color(21, 21, 21),
            ), navigationIcon = {
                IconButton(onClick = {
                    /*viewModel.signOut()
                    onNavigateToLogin()*/
                    scope.launch {
                        if (drawerState.isClosed) {
                            drawerState.open()
                        } else {
                            drawerState.close()
                        }
                    }
                }) {
                    Icon(
                        imageVector = Icons.Filled.Menu,
                        tint = Color.White,
                        contentDescription =
                        null
                    )
                }
            })
        }) { innerPadding ->
            SwipeRefresh(state = SwipeRefreshState(isRfreshing),
                indicatorPadding = innerPadding,
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

}


@Composable
fun MessageItem(message: CryptoAsset) {
    var previousPrice by remember { mutableStateOf(message.price) }
    var highlightColor by remember { mutableStateOf(Color.Gray) }
    val imageVector = ImageVector.vectorResource(id = message.idIcon)

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
            /*Image(
                painter = painterResource(id = message.idIcon),
                contentDescription = "Crypto Icon ${message.name}",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(50.dp)
            )*/
            AsyncImage(
                model = message.idIcon,
                contentDescription = "Crypto Icon ${message.name}",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(50.dp)
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