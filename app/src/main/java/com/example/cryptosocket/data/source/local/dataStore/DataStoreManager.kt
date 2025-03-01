package com.example.cryptosocket.data.source.local.dataStore

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.cryptosocket.domain.models.UserData
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

private val Context.dataStore by preferencesDataStore(name = "user_prefs")

@Singleton
class DataStoreManager @Inject constructor(
    @ApplicationContext private val context: Context
) {

    companion object {
        private val GOOGLE_TOKEN_KEY = stringPreferencesKey("google_token")
        private val GOOGLE_DISPLAY_NAME_KEY = stringPreferencesKey("google_display_name")
        private val GOOGLE_EMAIL_KEY = stringPreferencesKey("google_email")
        private val GOOGLE_PHOTO_URL_KEY = stringPreferencesKey("google_photo_url")
    }

    val userData: Flow<UserData?> = context.dataStore.data.map { preferences ->
        val displayName = preferences[GOOGLE_DISPLAY_NAME_KEY] ?: ""
        val email = preferences[GOOGLE_EMAIL_KEY] ?: ""
        val photoUrl = preferences[GOOGLE_PHOTO_URL_KEY] ?: ""
        val token = preferences[GOOGLE_TOKEN_KEY] ?: ""
        if (displayName != null && email != null) {
            UserData(displayName, email, photoUrl, token)
        } else {
            null
        }
    }

    suspend fun saveGoogleCredentials(
        displayName: String,
        email: String,
        photoUrl: String,
        token: String
    ) {
        context.dataStore.edit { preferences ->
            preferences[GOOGLE_DISPLAY_NAME_KEY] = displayName
            preferences[GOOGLE_EMAIL_KEY] = email
            preferences[GOOGLE_PHOTO_URL_KEY] = photoUrl
            preferences[GOOGLE_TOKEN_KEY] = token
        }
    }

    suspend fun saveUserName(name: String) {
        context.dataStore.edit { preferences ->
            preferences[GOOGLE_DISPLAY_NAME_KEY] = name
        }
    }

    suspend fun saveUserEmail(email: String) {
        context.dataStore.edit { preferences ->
            preferences[GOOGLE_EMAIL_KEY] = email
        }
    }

    suspend fun saveUserPhotoUrl(photoUrl: String) {
        context.dataStore.edit { preferences ->
            preferences[GOOGLE_PHOTO_URL_KEY] = photoUrl
        }
    }


    suspend fun clearGoogleCredentials() {
        context.dataStore.edit { preferences ->
            preferences.remove(GOOGLE_DISPLAY_NAME_KEY)
            preferences.remove(GOOGLE_EMAIL_KEY)
            preferences.remove(GOOGLE_PHOTO_URL_KEY)
            preferences.remove(GOOGLE_TOKEN_KEY)
        }
    }
}