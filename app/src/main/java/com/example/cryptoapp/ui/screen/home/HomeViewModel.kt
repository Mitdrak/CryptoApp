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
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: WebSocketRepository,
    private val cryptoRepository: CryptoRepository
) : ViewModel() {

    private val _cryptoAsssetsData = MutableStateFlow<List<CryptoAsset>>(emptyList())
    val cryptoAssetsData: StateFlow<List<CryptoAsset>> = _cryptoAsssetsData


    init {
        firstTimeSetup()
        collectMessages()
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
            repository.messages.collectLatest { message ->
                try {
                message?.let {
                    cryptoRepository.updateCryptoPriceFromSocket(it)
                }
                } catch (e: Exception) {
                    println("Error updating price: ${e.message}")
                }
            }
        }
    }


    fun connectWebSocket() {
        repository.startWebSocket(
            SocketRequest(
                id = 3,
                method = "lastprice_subscribe",
                params = cryptoAssets.map { it.symbol + "_USDT" }
            )
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