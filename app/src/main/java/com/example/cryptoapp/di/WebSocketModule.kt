package com.example.cryptoapp.di

import com.example.cryptoapp.data.repository.WebSocketRepositoryImpl
import com.example.cryptoapp.data.source.remote.websocket.WebSocketService
import com.example.cryptoapp.data.source.remote.websocket.WebSocketServiceImpl
import com.example.cryptoapp.domain.repository.WebSocketRepository
import com.example.cryptoapp.domain.usecases.socket.CloseWebSocketUseCase
import com.example.cryptoapp.domain.usecases.socket.DisconnectWebSocketUseCase
import com.example.cryptoapp.domain.usecases.socket.SendWebSocketMessageUseCase
import com.example.cryptoapp.domain.usecases.socket.StartWebSocketUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // Install the module in the SingletonComponent
object WebSocketModule {

    @Provides
    @Singleton
    fun provideWebSocketClient(okHttpClient: OkHttpClient): WebSocketService {
        return WebSocketServiceImpl(okHttpClient)
    }

    @Provides
    @Singleton
    fun provideWebSocketRepository(webSocketClient: WebSocketService): WebSocketRepository {
        return WebSocketRepositoryImpl(webSocketClient)
    }


    // Provide the use cases
    @Provides
    @Singleton
    fun provideStartWebSocketUseCase(repository: WebSocketRepository): StartWebSocketUseCase {
        return StartWebSocketUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideSendWebSocketMessageUseCase(repository: WebSocketRepository): SendWebSocketMessageUseCase {
        return SendWebSocketMessageUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideCloseWebSocketUseCase(repository: WebSocketRepository): CloseWebSocketUseCase {
        return CloseWebSocketUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideDisconnectWebSocketUseCase(repository: WebSocketRepository): DisconnectWebSocketUseCase {
        return DisconnectWebSocketUseCase(repository)
    }
}