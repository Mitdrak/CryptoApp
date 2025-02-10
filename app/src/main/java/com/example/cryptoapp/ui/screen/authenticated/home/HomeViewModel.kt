package com.example.cryptoapp.ui.screen.authenticated.home


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptoapp.data.model.dto.CryptoAsset
import com.example.cryptoapp.data.model.dto.SocketRequest
import com.example.cryptoapp.domain.repository.AuthRepository
import com.example.cryptoapp.domain.repository.LocalCryptoRepository
import com.example.cryptoapp.domain.repository.WebSocketRepository
import com.example.cryptoapp.domain.usecases.CloseWebSocketUseCase
import com.example.cryptoapp.domain.usecases.DisconnectWebSocketUseCase
import com.example.cryptoapp.domain.usecases.SendWebSocketMessageUseCase
import com.example.cryptoapp.domain.usecases.StartWebSocketUseCase
import com.example.cryptoapp.util.cryptoAssets
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
    private val startWebSocketUseCase: StartWebSocketUseCase,
    private val sendWebSocketMessageUseCase: SendWebSocketMessageUseCase,
    private val closeWebSocketUseCase: CloseWebSocketUseCase,
    private val disconnectWebSocketUseCase: DisconnectWebSocketUseCase,
    private val repository: WebSocketRepository,
    private val localCryptoRepository: LocalCryptoRepository,
    private val authRepository: AuthRepository
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
            authRepository.signOut()
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
            localCryptoRepository.initialDatabaseIfEmpty()
            loadCryptoAssets()
            connectWebSocket() // Connect to WebSocket after data is loaded

        }
    }


    private fun loadCryptoAssets() {
        viewModelScope.launch {
            localCryptoRepository.allCryptoAssets.collect { entities ->
                _cryptoAsssetsData.value = entities.map { entity ->
                    CryptoAsset(
                        name = entity.name,
                        symbol = entity.symbol,
                        price = entity.price,
                        localIcon = entity.imageUrl
                    )
                }.sortedBy { it.name }

            }
        }
    }

    private fun collectMessages() {
        viewModelScope.launch {
            try {
                repository.messages.collectLatest { message ->
                    message?.let {
                        localCryptoRepository.updateCryptoPriceFromSocket(it)
                    }
                }
            } catch (e: Exception) {
                println("Error updating price: ${e.message}")
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