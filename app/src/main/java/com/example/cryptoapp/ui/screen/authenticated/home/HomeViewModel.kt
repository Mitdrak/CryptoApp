package com.example.cryptoapp.ui.screen.authenticated.home


import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptoapp.data.model.dto.CryptoAsset
import com.example.cryptoapp.data.source.remote.websocket.WebSocketState
import com.example.cryptoapp.domain.repository.LocalCryptoRepository
import com.example.cryptoapp.domain.repository.WebSocketRepository
import com.example.cryptoapp.domain.usecases.auth.SignOutUseCase
import com.example.cryptoapp.domain.usecases.socket.CloseWebSocketUseCase
import com.example.cryptoapp.domain.usecases.socket.CollectWebSocketMessagesUseCase
import com.example.cryptoapp.domain.usecases.socket.DisconnectWebSocketUseCase
import com.example.cryptoapp.domain.usecases.socket.StartWebSocketUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
    private val startWebSocketUseCase: StartWebSocketUseCase,
    private val closeWebSocketUseCase: CloseWebSocketUseCase,
    private val disconnectWebSocketUseCase: DisconnectWebSocketUseCase,
    private val signOutUseCase: SignOutUseCase,
    private val collectMessagesUseCase: CollectWebSocketMessagesUseCase,
    private val localCryptoRepository: LocalCryptoRepository,
) : ViewModel() {

    val _cryptoAsssetsData = MutableStateFlow<List<CryptoAsset>>(emptyList())
    private val _searchQuery = MutableStateFlow("") // Holds the user's search input
    var searchQuery: StateFlow<String> = _searchQuery.asStateFlow()
    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()
    // New state to track errors
    private val _errorState = MutableStateFlow<String?>(null)
    val errorState: StateFlow<String?> get()  = _errorState

    init {
        firstTimeSetup()
        collectMessages()
    }

    fun signOut() {
        viewModelScope.launch {
            closeWebSocket()
            signOutUseCase()
        }
    }

    // Computed state: Filtered list based on search query
    val filteredList: StateFlow<List<CryptoAsset>> =
        _searchQuery.combine(_cryptoAsssetsData) { query, list ->
            if (query.isEmpty()) list else list.filter {
                it.name.contains(
                    query, ignoreCase = true
                ) || it.symbol.contains(query, ignoreCase = true)
            }
        }.stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    fun onSearchQueryChanged(query: String) {
        _searchQuery.value = query
    }

    fun retryWebSocketConnection() {
        viewModelScope.launch {
            _isRefreshing.value = true
            closeWebSocket()
            connectWebSocket()
            _isRefreshing.value = false
        }
    }

    fun firstTimeSetup() {
        viewModelScope.launch {
            localCryptoRepository.initializeDatabaseIfEmpty()
            loadCryptoAssets()
            connectWebSocket() // Connect to WebSocket after data is loaded

        }
    }


    fun loadCryptoAssets() {
        viewModelScope.launch {
            try {
                val entities = localCryptoRepository.allCryptoAssets.first() // Use first()
                _cryptoAsssetsData.value = entities.map { entity ->
                    Timber.d("Loading asset: ${entity.name}")
                    CryptoAsset(
                        name = entity.name,
                        symbol = entity.symbol,
                        price = entity.price,
                        idIcon = entity.imageUrl
                    )
                }.sortedBy { it.name }
            } catch (e: Exception) {
                // Handle exceptions, e.g., log them
                Timber.tag("CryptoAssets").e("Error loading assets: ${e.message}")
                // Consider setting a default value or showing an error message
                _cryptoAsssetsData.value = emptyList() // Example: Set to empty list on error
            }
        }
    }

    fun collectMessages() {
        viewModelScope.launch {
            try {
                Timber.d("Collecting WebSocket messages...")
                collectMessagesUseCase.messages.collect { message ->
                    try {
                        when(message) {
                            is WebSocketState.Connected -> {
                                Timber.d("WebSocket connected")
                            }

                            is WebSocketState.Disconnected -> {
                                Timber.d("WebSocket disconnected")
                            }

                            is WebSocketState.Error -> {
                                _errorState.value = message.message
                                Timber.e("WebSocket error: ${message.message}")
                            }
                            is WebSocketState.MessageReceived -> {

                                Timber.d("Received WebSocket message: $message")
                                _cryptoAsssetsData.value = _cryptoAsssetsData.value.map { cryptoAsset ->
                                    val symbol = message.message.params.getOrNull(0)?.split("_")?.getOrNull(0)
                                    val price = message.message.params.getOrNull(1)?.toDoubleOrNull()
                                    if (cryptoAsset.symbol == symbol) {
                                        cryptoAsset.copy(price = price ?: cryptoAsset.price)
                                    } else {
                                        cryptoAsset
                                    }
                                }
                                localCryptoRepository.updateCryptoPriceFromSocket(message)
                            }
                        }
                    } catch (e: Exception) {
                        _errorState.value = "Error updating price from WebSocket message"
                        Timber.e(e, "Error updating price from WebSocket message")
                    }
                }
            } catch (e: Exception) {
                _errorState.value = "Error during WebSocket message collection: ${e.message}"
                Timber.e(e, "Error collecting WebSocket messages")
            }
        }
    }


    fun connectWebSocket() {
        startWebSocketUseCase()
    }

    fun closeWebSocket() {
        println("Closing WebSocket connection en ViewModel")
        closeWebSocketUseCase()
    }

    fun disconnectWebSocket() {
        disconnectWebSocketUseCase()
    }

}