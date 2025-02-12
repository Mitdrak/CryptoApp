package com.example.cryptoapp.ui.screen.authenticated.home


import com.example.cryptoapp.R
import com.example.cryptoapp.data.model.dto.CryptoAsset
import com.example.cryptoapp.data.model.dto.SocketResponse
import com.example.cryptoapp.data.model.entity.CryptoAssetEntity
import com.example.cryptoapp.data.source.remote.websocket.WebSocketState
import com.example.cryptoapp.domain.repository.LocalCryptoRepository
import com.example.cryptoapp.domain.repository.WebSocketRepository
import com.example.cryptoapp.domain.usecases.auth.SignOutUseCase
import com.example.cryptoapp.domain.usecases.socket.CloseWebSocketUseCase
import com.example.cryptoapp.domain.usecases.socket.DisconnectWebSocketUseCase
import com.example.cryptoapp.domain.usecases.socket.StartWebSocketUseCase
import com.google.common.base.Verify.verify
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import io.mockk.runs
import io.mockk.verify
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify

class HomeViewModelTest {
    @OptIn(ExperimentalCoroutinesApi::class)
    @get:Rule
    val mainDispatcherRule = MainDispatcherRule() // Custom rule for setting TestDispatcher

    // Mock dependencies
    private lateinit var viewModel: HomeViewModel
    private val mockStartWebSocketUseCase: StartWebSocketUseCase = mockk(relaxed = true)
    private val mockCloseWebSocketUseCase: CloseWebSocketUseCase = mockk(relaxed = true)
    private val mockDisconnectWebSocketUseCase: DisconnectWebSocketUseCase = mockk(relaxed = true)
    private val mockSignOutUseCase: SignOutUseCase = mockk(relaxed = true)
    private val mockWebSocketRepository: WebSocketRepository = mockk()
    private val mockLocalCryptoRepository: LocalCryptoRepository = mockk()

    @Before
    fun setUp() {
        // Initialize mocks


        // Initialize ViewModel with mocked dependencies
        viewModel = HomeViewModel(
            mockStartWebSocketUseCase,
            mockCloseWebSocketUseCase,
            mockDisconnectWebSocketUseCase,
            mockSignOutUseCase,
            mockWebSocketRepository,
            mockLocalCryptoRepository
        )
    }

    @Test
    fun `loadCryptoAssets should update cryptoAssetsData`() = runTest {
        // Arrange
        val cryptoEntities = listOf(
            CryptoAsset("Bitcoin", "BTC", 0.0, idIcon = R.drawable.bitcoin_btc_logo),
            CryptoAsset("Ethereum", "ETH", 0.0, idIcon = R.drawable.ethereum_eth_logo),
        )
        `when`(mockLocalCryptoRepository.allCryptoAssets).thenReturn(flowOf(cryptoEntities.map {
            CryptoAssetEntity(it.name, it.symbol, it.price, it.idIcon)
        }))

        // Act
        viewModel.loadCryptoAssets()

        // Assert
        assertEquals(cryptoEntities, viewModel._cryptoAsssetsData.value)
    }
}