package com.example.cryptosocket.data.repository


import android.app.Activity
import androidx.credentials.ClearCredentialStateRequest
import androidx.credentials.CredentialManager
import androidx.credentials.CustomCredential
import androidx.credentials.GetCredentialRequest
import androidx.credentials.GetCredentialResponse
import com.example.cryptosocket.BuildConfig
import com.example.cryptosocket.data.source.local.dataStore.DataStoreManager
import com.example.cryptosocket.domain.repository.AuthRepository
import com.google.android.libraries.identity.googleid.GetGoogleIdOption
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.tasks.await
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepositoryImpl @Inject constructor(
    private val firebaseAuth: FirebaseAuth,
    private val credentialManager: CredentialManager,
    private val dataStoreManager: DataStoreManager
) : AuthRepository {


    override suspend fun signIn(email: String, password: String): Boolean {
        return try {
            firebaseAuth.signInWithEmailAndPassword(email, password).await()
            val user = firebaseAuth.currentUser
            if (user != null) {
                dataStoreManager.saveUserName(user.displayName!!)
                dataStoreManager.saveUserEmail(user.email!!)
                dataStoreManager.saveUserPhotoUrl(user.photoUrl.toString())
            }
            /*val user = firebaseAuth.currentUser
            user!!.updateProfile(userProfileChangeRequest {
                displayName = "Sergio"
            }).addOnCompleteListener {
                if (it.isSuccessful) {
                    println("User updated")
                    if (user != null) {
                        println("User: ${user.displayName}")
                    }
                } else {
                    println("User not updated")
                }
            }.await()*/
            true
        } catch (e: Exception) {
            // Log the error or handle it appropriately
            println("Sign in failed: ${e.message}")
            false
        }
    }

    override suspend fun signInWithGoogle(activity: Activity): Boolean {
        try {
            val result = getCredentialRequest(activity)
            return handleSignIn(result)
        } catch (e: Exception) {
            println("Sign in with Google failed Repository: ${e.message}")
            if (e is CancellationException) throw e
            println("Sign in with Google failed: ${e.message}")
            return false
        }

    }

    private suspend fun handleSignIn(result: GetCredentialResponse): Boolean {
        val credential = result.credential
        if (credential is CustomCredential && credential.type == GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL) {
            try {
                val tokenCredential = GoogleIdTokenCredential.createFrom(credential.data)
                println("Google Name: ${tokenCredential.displayName}")
                println("Google Token: ${tokenCredential.idToken}")
                println("Google Email: ${tokenCredential.id}")
                println("Google Image: ${tokenCredential.profilePictureUri}")
                val authCredential = GoogleAuthProvider.getCredential(tokenCredential.idToken, null)
                val authResult = firebaseAuth.signInWithCredential(authCredential).await()
                if (authResult.user != null) {
                    dataStoreManager.clearGoogleCredentials()
                    dataStoreManager.saveGoogleCredentials(
                        displayName = tokenCredential.displayName.toString(),
                        email = tokenCredential.id,
                        photoUrl = tokenCredential.profilePictureUri.toString(),
                        token = tokenCredential.idToken.toString()
                    )
                }
                return authResult.user != null
            } catch (e: GoogleIdTokenParsingException) {
                Timber.e(e)
                return false
            }
        } else {
            return false
        }
    }

    private suspend fun getCredentialRequest(activity: Activity): GetCredentialResponse {


        val googleIdOption: GetGoogleIdOption =
            GetGoogleIdOption.Builder().setFilterByAuthorizedAccounts(false)
                .setServerClientId(BuildConfig.CLIENT_ID).build()
        val request: GetCredentialRequest =
            GetCredentialRequest.Builder().addCredentialOption(googleIdOption).build()


        return credentialManager.getCredential(activity, request)
    }


    override suspend fun signUp(email: String, password: String): Boolean {
        return try {
            firebaseAuth.createUserWithEmailAndPassword(email, password).await()
            true
        } catch (e: Exception) {
            // Log the error or handle it appropriately
            println("Sign up failed: ${e.message}")
            false
        }
    }

    override suspend fun signOut() {
        try {
            credentialManager.clearCredentialState(
                ClearCredentialStateRequest()
            )
            firebaseAuth.signOut()
        } catch (e: Exception) {
            // Log the error or handle it appropriately
            println("Sign out failed: ${e.message}")
        }
    }

    override suspend fun getCurrentUser(): FirebaseUser? {
        return try {
            firebaseAuth.currentUser
        } catch (e: Exception) {
            // Log the error or handle it appropriately
            println("Failed to get current user: ${e.message}")
            null
        }
    }
}