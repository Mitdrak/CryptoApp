package com.example.cryptosocket.ui.screen.authenticated.home


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptosocket.data.model.dto.CryptoAsset
import com.example.cryptosocket.data.source.remote.websocket.WebSocketState
import com.example.cryptosocket.domain.models.UserData
import com.example.cryptosocket.domain.repository.LocalCryptoRepository
import com.example.cryptosocket.domain.repository.UserRepository
import com.example.cryptosocket.domain.usecases.auth.SignOutUseCase
import com.example.cryptosocket.domain.usecases.socket.CloseWebSocketUseCase
import com.example.cryptosocket.domain.usecases.socket.CollectWebSocketMessagesUseCase
import com.example.cryptosocket.domain.usecases.socket.DisconnectWebSocketUseCase
import com.example.cryptosocket.domain.usecases.socket.StartWebSocketUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

/**
 * ViewModel for the home screen.
 *
 * @property startWebSocketUseCase Use case to start the WebSocket connection.
 * @property closeWebSocketUseCase Use case to close the WebSocket connection.
 * @property disconnectWebSocketUseCase Use case to disconnect the WebSocket connection.
 * @property signOutUseCase Use case to sign out the user.
 * @property collectMessagesUseCase Use case to collect WebSocket messages.
 * @property localCryptoRepository Repository for local crypto data.
 * @property userRepository Repository for user data.
 */
@HiltViewModel
class HomeViewModel @Inject constructor(
    private val startWebSocketUseCase: StartWebSocketUseCase,
    private val closeWebSocketUseCase: CloseWebSocketUseCase,
    private val disconnectWebSocketUseCase: DisconnectWebSocketUseCase,
    private val signOutUseCase: SignOutUseCase,
    private val collectMessagesUseCase: CollectWebSocketMessagesUseCase,
    private val localCryptoRepository: LocalCryptoRepository,
    private val userRepository: UserRepository
) : ViewModel() {

    val _cryptoAsssetsData = MutableStateFlow<List<CryptoAsset>>(emptyList())
    private val _searchQuery = MutableStateFlow("") // Holds the user's search input
    var searchQuery: StateFlow<String> = _searchQuery.asStateFlow()
    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

    // New state to track errors
    private val _errorState = MutableStateFlow<String?>(null)
    val errorState: StateFlow<String?> get() = _errorState
    private val _signOutState = MutableStateFlow(false)
    val signOutState: StateFlow<Boolean> = _signOutState
    private val _webSocketState =
        MutableStateFlow<WebSocketState>(WebSocketState.Disconnected) // Track WebSocket state
    val webSocketState: StateFlow<WebSocketState> = _webSocketState.asStateFlow()


    init {
        firstTimeSetup()
        collectMessages()
    }

    val userData: StateFlow<UserData?> = userRepository.userData.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5000),
        null
    )

    /**
     * Signs out the user.
     */
    fun signOut() {
        viewModelScope.launch {
            closeWebSocket()
            signOutUseCase()
            userRepository.clearUserData()
            _signOutState.value = true
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

    /**
     * Updates the search query.
     *
     * @param query The new search query.
     */
    fun onSearchQueryChanged(query: String) {
        _searchQuery.value = query
    }

    /**
     * Retries the WebSocket connection.
     */
    fun retryWebSocketConnection() {
        viewModelScope.launch {
            _isRefreshing.value = true
            closeWebSocket()
            connectWebSocket()
            _isRefreshing.value = false
        }
    }

    /**
     * Performs the initial setup.
     */
    fun firstTimeSetup() {
        viewModelScope.launch {
            localCryptoRepository.initializeDatabaseIfEmpty()
            loadCryptoAssets()
            connectWebSocket() // Connect to WebSocket after data is loaded

        }
    }

    /**
     * Loads the crypto assets from the local repository.
     */
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

    /**
     * Collects messages from the WebSocket.
     */
    private fun collectMessages() {  // Make private as it's an internal function
        viewModelScope.launch {
            collectMessagesUseCase.messages.collect { state ->  // Collect WebSocketState directly
                _webSocketState.value = state // Update WebSocket state

                when (state) {
                    is WebSocketState.Connected -> {
                        Timber.d("WebSocket connected")
                    }

                    is WebSocketState.Disconnected -> {
                        Timber.d("WebSocket disconnected")
                        // Optionally, reconnect after a delay or based on some criteria
                        // viewModelScope.launch { delay(5000); connectWebSocket() }
                    }

                    is WebSocketState.Error -> {
                        _errorState.value = state.message
                        Timber.e("WebSocket error: ${state.message}")
                    }

                    is WebSocketState.MessageReceived -> {
                        updateCryptoPrices(state) // Extract price update logic
                    }

                    WebSocketState.Connecting -> {
                        Timber.d("WebSocket connecting")
                    }

                    WebSocketState.Disconnecting -> {
                        Timber.d("WebSocket disconnecting")
                    }
                }
            }
        }
    }

    /**
     * Updates the crypto prices based on the received WebSocket message.
     *
     * @param message The received WebSocket message.
     */
    private fun updateCryptoPrices(message: WebSocketState.MessageReceived) {
        viewModelScope.launch { // Launch in viewModelScope for database update
            try {
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
            } catch (e: Exception) {
                _errorState.value = "Error updating price: ${e.message}" // More specific error
                Timber.e(e, "Error updating price")
            }
        }
    }

    /**
     * Connects to the WebSocket.
     */
    fun connectWebSocket() {
        viewModelScope.launch { // Launch in viewModelScope
            _webSocketState.value = WebSocketState.Connecting // Indicate connecting state
            startWebSocketUseCase()

        }
    }

    /**
     * Closes the WebSocket connection.
     */
    fun closeWebSocket() {
        println("Closing WebSocket connection en ViewModel")
        viewModelScope.launch { // Launch in viewModelScope
            _webSocketState.value = WebSocketState.Disconnecting // Indicate disconnecting state
            closeWebSocketUseCase()
            _webSocketState.value = WebSocketState.Disconnected // Update state after closing
        }
    }

    /**
     * Disconnects the WebSocket connection.
     */
    fun disconnectWebSocket() {
        viewModelScope.launch {
            _webSocketState.value = WebSocketState.Disconnecting
            disconnectWebSocketUseCase()
            _webSocketState.value = WebSocketState.Disconnected
        }
    }

    /**
     * Called when the ViewModel is cleared.
     */
    override fun onCleared() {
        closeWebSocket()
        super.onCleared()
    }

}