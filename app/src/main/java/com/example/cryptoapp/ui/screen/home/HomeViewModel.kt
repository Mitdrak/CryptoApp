package com.example.cryptoapp.ui.screen.home


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptoapp.data.model.dto.CryptoAsset
import com.example.cryptoapp.data.model.dto.SocketRequest
import com.example.cryptoapp.data.model.dto.SocketResponse
import com.example.cryptoapp.data.repository.CryptoRepository
import com.example.cryptoapp.data.repository.WebSocketRepository
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
    private val repository: WebSocketRepository, private val cryptoRepository: CryptoRepository
) : ViewModel() {

    private val _cryptoAsssetsData = MutableStateFlow<List<CryptoAsset>>(emptyList())
    private val _searchQuery = MutableStateFlow("") // Holds the user's search input
    var searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    // Computed state: Filtered list based on search query
    val filteredList: StateFlow<List<CryptoAsset>> =
        _searchQuery.combine(_cryptoAsssetsData) { query, list ->
            if (query.isEmpty()) list else list.filter {
                it.name.contains(
                    query, ignoreCase = true
                ) || it.symbol.contains(query, ignoreCase = true)
            }
        }.stateIn(viewModelScope, SharingStarted.Lazily, emptyList())


    init {
        firstTimeSetup()
        collectMessages()
    }

    fun onSearchQueryChanged(query: String) {
        _searchQuery.value = query
    }

    private fun firstTimeSetup() {
        viewModelScope.launch {
            cryptoRepository.initialDatabaseIfEmpty()
            loadCryptoAssets()
            connectWebSocket() // Connect to WebSocket after data is loaded

        }
    }


    private fun loadCryptoAssets() {
        viewModelScope.launch {
            cryptoRepository.allCryptoAssets.collect { entities ->
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
                        cryptoRepository.updateCryptoPriceFromSocket(it)
                    }
                }
            } catch (e: Exception) {
                println("Error updating price: ${e.message}")
            }
        }
    }


    fun connectWebSocket() {
        repository.startWebSocket(
            SocketRequest(id = 3,
                method = "lastprice_subscribe",
                params = cryptoAssets.map { it.symbol + "_USDT" })
        )
    }

    fun closeWebSocket() {
        repository.closeConnection()
    }

    fun sendMessage() {
        repository.sendMessage(
            SocketRequest(
                id = 3,
                method = "lastprice_subscribe",
                params = _cryptoAsssetsData.value.map {
                    it.symbol + "_USDT"
                })
        )

    }
}