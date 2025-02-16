package com.example.cryptosocket.ui.screen.authenticated.home


import app.cash.turbine.test
import com.example.cryptosocket.data.model.dto.CryptoAsset
import com.example.cryptosocket.data.model.dto.SocketResponse
import com.example.cryptosocket.data.model.entity.CryptoAssetEntity
import com.example.cryptosocket.data.source.remote.websocket.WebSocketState
import com.example.cryptosocket.domain.repository.LocalCryptoRepository
import com.example.cryptosocket.domain.usecases.auth.SignOutUseCase
import com.example.cryptosocket.domain.usecases.socket.CloseWebSocketUseCase
import com.example.cryptosocket.domain.usecases.socket.CollectWebSocketMessagesUseCase
import com.example.cryptosocket.domain.usecases.socket.DisconnectWebSocketUseCase
import com.example.cryptosocket.domain.usecases.socket.StartWebSocketUseCase
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class HomeViewModelTest {

    @get:Rule
    val mainDispatcherRule = MainDispatcherRule() // Custom rule for setting TestDispatcher

    // Mock dependencies
    private lateinit var viewModel: HomeViewModel
    private val mockStartWebSocketUseCase: StartWebSocketUseCase = mockk(relaxed = true)
    private val mockCloseWebSocketUseCase: CloseWebSocketUseCase = mockk(relaxed = true)
    private val mockDisconnectWebSocketUseCase: DisconnectWebSocketUseCase = mockk(relaxed = true)
    private val mockSignOutUseCase: SignOutUseCase = mockk(relaxed = true)
    private val mockCollectWebSocketMessagesUseCase: CollectWebSocketMessagesUseCase =
        mockk(relaxed = true)
    private val mockLocalCryptoRepository: LocalCryptoRepository = mockk()

    @Before
    fun setUp() {
        // Initialize mocks
        // Stub DAO flow to return sample data
        val fakeCryptoAssets = listOf(
            CryptoAssetEntity(symbol = "BTC", name = "Bitcoin", price = 50000.0, imageUrl = 1),
            CryptoAssetEntity(symbol = "ETH", name = "Ethereum", price = 3000.0, imageUrl = 1)
        )

        val messageUpdate = listOf(
            CryptoAsset(symbol = "BTC", name = "Bitcoin", price = 50000.0, idIcon = 1),
            CryptoAsset(symbol = "ETH", name = "Ethereum", price = 3000.0, idIcon = 1)
        )



        every { mockLocalCryptoRepository.allCryptoAssets } returns flowOf(fakeCryptoAssets)
        coEvery { mockLocalCryptoRepository.initializeDatabaseIfEmpty() } returns Unit

        // Initialize ViewModel with mocked dependencies
        viewModel = HomeViewModel(
            mockStartWebSocketUseCase,
            mockCloseWebSocketUseCase,
            mockDisconnectWebSocketUseCase,
            mockSignOutUseCase,
            mockCollectWebSocketMessagesUseCase,
            mockLocalCryptoRepository
        )

    }

    @Test
    fun `loadCryptoAssets should update _cryptoAsssetsData`() = runTest {


        viewModel._cryptoAsssetsData.test {
            // Keep awaiting items until we get one with 2 elements
            var emittedList = awaitItem()
            while (emittedList.isEmpty()) {
                emittedList = awaitItem() // Keep waiting
            }

            assertEquals(2, emittedList.size) // Expecting 2 items
            assertEquals("Bitcoin", emittedList[0].name) // Verify first item
        }
    }

    @Test
    fun `collectMessages should update localCryptoRepository when receiving WebSocket messages`() =
        runTest {
            // Sample WebSocket message
            val sampleMessage = WebSocketState.MessageReceived(
                SocketResponse(
                    id = null, method = "ticker", params = listOf("BTC_USD", "52000.0")
                )
            )

            // Mock messages as StateFlow
            val messageFlow: StateFlow<WebSocketState> =
                flowOf(sampleMessage).stateIn(this, SharingStarted.Lazily, sampleMessage)

            // Stub WebSocket message flow to emit the sample message
            every { mockCollectWebSocketMessagesUseCase.messages } returns messageFlow

            // Call the function that collects messages
            viewModel.collectMessages()

            advanceUntilIdle() // Advance time until all coroutines are done

            // Verify that updateCryptoPriceFromSocket is called with the correct data
            coVerify { mockLocalCryptoRepository.updateCryptoPriceFromSocket(sampleMessage) }
        }

    @Test
    fun `loadCryptoAssets should load data from repository and update _cryptoAsssetsData`() =
        runTest {
            // Sample crypto assets returned from the repository
            val fakeCryptoAssets = listOf(
                CryptoAssetEntity(symbol = "BTC", name = "Bitcoin", price = 50000.0, imageUrl = 1),
                CryptoAssetEntity(symbol = "ETH", name = "Ethereum", price = 3000.0, imageUrl = 1)
            )

            // Stub the repository to return fake assets
            every { mockLocalCryptoRepository.allCryptoAssets } returns flowOf(fakeCryptoAssets)

            // Call the method that loads the assets
            viewModel.loadCryptoAssets()

            // Collect the emitted data and verify it's correctly mapped
            viewModel._cryptoAsssetsData.test {
                var emittedList = awaitItem()
                while (emittedList.isEmpty()) {
                    emittedList = awaitItem() // Keep waiting
                }
                // Verify the data was transformed correctly
                assertEquals(2, emittedList.size) // Check the number of assets
                assertEquals("Bitcoin", emittedList[0].name) // Check first asset
                assertEquals("Ethereum", emittedList[1].name) // Check second asset
            }
        }

    @Test
    fun `onSearchQueryChanged should update searchQuery state`() = runTest {
        val query = "Bitcoin"

        // Call the method to update the search query
        viewModel.onSearchQueryChanged(query)

        // Verify that the search query has been updated
        assertEquals(query, viewModel.searchQuery.value)
    }

    @Test
    fun `retryWebSocketConnection should reconnect WebSocket`() = runTest {
        // Call the method to retry the WebSocket connection

        viewModel.retryWebSocketConnection()
        advanceUntilIdle() // Advance time until all coroutines are done

        // Verify that the WebSocket was closed and then connected
        coVerify { mockCloseWebSocketUseCase() }
        coVerify { mockStartWebSocketUseCase() }
    }

    @Test
    fun `signOut should close WebSocket and call signOutUseCase`() = runTest {
        // Call the sign-out method
        viewModel.signOut()
        advanceUntilIdle() // Advance time until all coroutines are done

        // Verify that the WebSocket connection was closed
        coVerify { mockCloseWebSocketUseCase() }

        // Verify that the sign-out use case was called
        coVerify { mockSignOutUseCase() }
    }

    @Test
    fun `collectMessages should catch errors and update error state`() = runTest {
        // Arrange
        val mockStateFlow =
            MutableStateFlow<WebSocketState>(WebSocketState.Connected) // Initialize!
        val testErrorMessage = "Test error"

        // *** KEY CHANGE 1: Throw on collection, not value access ***
        coEvery { mockCollectWebSocketMessagesUseCase.messages } returns mockStateFlow

        // *** KEY CHANGE 2:  Use a more realistic error scenario ***
        mockStateFlow.value = WebSocketState.Connected // Simulate successful connection
        mockStateFlow.value =
            WebSocketState.Error(Exception(testErrorMessage).toString()) // Simulate error


        // Act: Call the method to collect messages
        viewModel.collectMessages()

        // *** KEY CHANGE 3: Await state update (important!) ***
        // You'll need a way to observe the errorState.  Here's a common approach:
        // (Adapt to your actual ViewModel's errorState and how it's updated)
        // For example if you use a shared flow:
        viewModel.errorState.test {
            var error = awaitItem()
            while (error == null) {
                // Keep waiting
                error = awaitItem()
            }
            assertEquals("Error during WebSocket message collection: $testErrorMessage", error)
            cancelAndIgnoreRemainingEvents()
        }
        // If you are using a StateFlow and you are collecting it in the viewModel itself you can use this approach
        // If you are using a shared flow and collecting it in the viewModel itself you may use awaitItem
        /*assertEquals(
            "Error during WebSocket message collection: $testErrorMessage",
            viewModel.errorState.value
        )*/
    }

    @Test
    fun `filteredList should filter crypto assets based on search query`() = runTest {
        // Sample crypto assets
        val assets = listOf(
            CryptoAssetEntity(symbol = "BTC", name = "Bitcoin", price = 50000.0, imageUrl = 1),
            CryptoAssetEntity(symbol = "ETH", name = "Ethereum", price = 3000.0, imageUrl = 1)
        )

        // Stub the repository to return the assets
        every { mockLocalCryptoRepository.allCryptoAssets } returns flowOf(assets)

        // Load assets into the viewModel
        viewModel.loadCryptoAssets()

        // Test with a search query
        viewModel.onSearchQueryChanged("Bitcoin")

        // Collect the filtered list and verify that it only contains "Bitcoin"
        val filtered = viewModel.filteredList.first { it.isNotEmpty() } // Wait for a non-empty list

        assertEquals(1, filtered.size) // Verify only one item is present
        assertEquals("Bitcoin", filtered[0].name) // Verify that the item is Bitcoin
    }


    @Test
    fun `firstTimeSetup should initialize database and connect WebSocket`() = runTest {
        // Stub the repository methods
        coEvery { mockLocalCryptoRepository.initializeDatabaseIfEmpty() } returns Unit
        coEvery { mockLocalCryptoRepository.allCryptoAssets } returns flowOf(emptyList())

        // Call the first time setup method
        viewModel.firstTimeSetup()

        // Verify that the database was initialized
        coVerify { mockLocalCryptoRepository.initializeDatabaseIfEmpty() }

        // Verify that WebSocket connection was started
        coVerify { mockStartWebSocketUseCase() }
    }


}