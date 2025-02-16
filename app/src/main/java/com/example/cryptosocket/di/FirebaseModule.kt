package com.example.cryptosocket.di

import android.content.Context
import androidx.credentials.CredentialManager
import com.example.cryptosocket.data.repository.AuthRepositoryImpl
import com.example.cryptosocket.data.source.local.dataStore.DataStoreManager
import com.example.cryptosocket.domain.repository.AuthRepository
import com.example.cryptosocket.domain.usecases.auth.GetCurrentUserUseCase
import com.example.cryptosocket.domain.usecases.auth.SignInUseCase
import com.example.cryptosocket.domain.usecases.auth.SignOutUseCase
import com.example.cryptosocket.domain.usecases.auth.SignUpUseCase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object FirebaseModule {
    @Provides
    @Singleton
    fun provideFirebaseAuth(): FirebaseAuth {
        return FirebaseAuth.getInstance()
    }

    @Provides
    @Singleton
    fun providesCredentialManager(@ApplicationContext context: Context): CredentialManager {
        return CredentialManager.create(context)
    }

    @Provides
    @Singleton
    fun provideFirestore(): FirebaseFirestore {
        return FirebaseFirestore.getInstance()
    }

    @Provides
    @Singleton
    fun provideAuthRepository(
        firebaseAuth: FirebaseAuth,
        credentialManager: CredentialManager,
        dataStoreManager: DataStoreManager
    ):
            AuthRepository {
        return AuthRepositoryImpl(firebaseAuth, credentialManager, dataStoreManager)
    }


    @Provides
    @Singleton
    fun provideSignInUseCase(repository: AuthRepository): SignInUseCase {
        return SignInUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideSignUpUseCase(repository: AuthRepository): SignUpUseCase {
        return SignUpUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideSignOutUseCase(repository: AuthRepository): SignOutUseCase {
        return SignOutUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideGetCurrentUserUseCase(repository: AuthRepository): GetCurrentUserUseCase {
        return GetCurrentUserUseCase(repository)
    }

}