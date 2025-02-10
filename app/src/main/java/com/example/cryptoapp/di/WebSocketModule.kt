package com.example.cryptoapp.di

import com.example.cryptoapp.data.repository.WebSocketRepositoryImpl
import com.example.cryptoapp.data.source.remote.api.WebSocketClient
import com.example.cryptoapp.data.source.remote.api.WebSocketClientImpl
import com.example.cryptoapp.domain.repository.WebSocketRepository
import com.example.cryptoapp.domain.usecases.CloseWebSocketUseCase
import com.example.cryptoapp.domain.usecases.DisconnectWebSocketUseCase
import com.example.cryptoapp.domain.usecases.SendWebSocketMessageUseCase
import com.example.cryptoapp.domain.usecases.StartWebSocketUseCase
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
    fun provideWebSocketClient(okHttpClient: OkHttpClient): WebSocketClient {
        return WebSocketClientImpl(okHttpClient)
    }

    @Provides
    @Singleton
    fun provideWebSocketRepository(webSocketClient: WebSocketClient): WebSocketRepository {
        return WebSocketRepositoryImpl(webSocketClient)
    }

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