package com.example.cryptoapp.ui.screen.authenticated.home


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
import kotlinx.coroutines.flow.combine
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
            localCryptoRepository.allCryptoAssets.collect { entities ->
                _cryptoAsssetsData.value = entities.map { entity ->
                    CryptoAsset(
                        name = entity.name,
                        symbol = entity.symbol,
                        price = entity.price,
                        idIcon = entity.imageUrl
                    )
                }.sortedBy { it.name }

            }
        }
    }

    private fun collectMessages() {
        viewModelScope.launch {
            collectMessagesUseCase.messages
                .catch { e ->
                    Timber.e(e, "Error collecting WebSocket messages")
                }
                .collect { message ->
                    try {
                        if (message is WebSocketState.MessageReceived) {
                            localCryptoRepository.updateCryptoPriceFromSocket(message)
                        }
                    } catch (e: Exception) {
                        Timber.e(e, "Error updating price from WebSocket message")
                    }
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