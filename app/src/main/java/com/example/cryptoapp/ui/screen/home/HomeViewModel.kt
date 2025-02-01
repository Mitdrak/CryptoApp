package com.example.cryptoapp.ui.screen.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptoapp.data.model.dto.CryptoAsset
import com.example.cryptoapp.data.model.dto.SocketRequest
import com.example.cryptoapp.data.model.dto.SocketResponse
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
class HomeViewModel @Inject constructor(private val repository: WebSocketRepository) : ViewModel() {
    private val _name = MutableStateFlow("")
    val name: StateFlow<String> = _name
    private val _surname = MutableStateFlow("")
    val surname: StateFlow<String> = _surname
    private val _messages = MutableStateFlow<List<SocketResponse?>>(emptyList())
    val messages = _messages.asStateFlow()
    private val _cryptoAsssetsData = MutableStateFlow<List<CryptoAsset>>(emptyList())
    val cryptoAssetsData: StateFlow<List<CryptoAsset>> = _cryptoAsssetsData


    init {
        loadCryptoAssets()
        collectMessages()
        connectWebSocket()
    }

    private fun loadCryptoAssets() {
        _cryptoAsssetsData.value = cryptoAssets
    }

    private fun collectMessages() {
        viewModelScope.launch {
            repository.messages.collectLatest { message ->
                message.let {
                    println("New message received: $it")
                    _messages.value += it
                }
            }
        }
    }

    fun changeName(newString: String) {
        _name.value = newString
    }

    fun changeSurName(newString: String) {
        _surname.value = newString
    }

    fun connectWebSocket() {
        /*repository.startWebSocket("wss://api.whitebit.com/ws")*/
        repository.startWebSocket()
    }

    fun closeWebSocket() {
        repository.closeConnection()
    }

    fun sendMessage() {
        repository.sendMessage(
            SocketRequest(
                id = 3,
                method = "lastprice_subscribe",
                params = listOf(
                    "BTC_USDT",
                    "ETH_USDT",
                    "SOL_USDT",
                    "DOGE_USDT",
                    "ADA_USDT",
                    "1INCH_USDT",
                    "AAVE_USDT",

                )
            )
        )
    }
}