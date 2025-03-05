package com.example.cryptosocket.ui.screen.authenticated.profile

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.hilt.navigation.compose.hiltViewModel
import coil3.compose.rememberAsyncImagePainter
import com.example.cryptosocket.ui.screen.authenticated.profile.state.ProfileUiEvent
import timber.log.Timber
import java.io.File
import java.io.FileOutputStream


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(onNavigateToHome: () -> Unit, viewModel: ProfileViewModel = hiltViewModel()) {
    val uiState by viewModel.uiState.collectAsState()
    var selectedImageUri by remember { mutableStateOf<Uri?>(null) }
    val context = LocalContext.current
    val localFile = remember { mutableStateOf<File?>(null) }


    LaunchedEffect(uiState.imageUri) {
        localFile.value =
            copyImageToCache(context, uiState.imageUri.toUri()) // Replace `photoUri` with
        // your actual URI
    }
    Timber.d("User Data: ${uiState.imageUri}")

    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            Timber.d("Image selected")
            val data = result.data
            selectedImageUri = data?.data // Get the image URI
            viewModel.onUiEvent(ProfileUiEvent.ImageUriChanged(selectedImageUri.toString()))
            Timber.d("Image URI SELECTED: ${uiState.imageUri}")
        }
    }
    Scaffold(topBar = {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    text = "Profile",
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            },
            navigationIcon = {
                IconButton(onClick = {
                    onNavigateToHome()
                }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription =
                        "Back", tint = Color.White
                    )
                }
            },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = Color(
                    21,
                    21,
                    21
                )
            )
        )
    }) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .background(Color(21, 21, 21))
        ) {
            Spacer(modifier = Modifier.height(32.dp))
            Box(modifier = Modifier.size(100.dp)) { // Same size as the image
                /*Image(
                    painter = painterResource(R.drawable.bitcoin_btc_logo),
                    contentDescription = "Bitcoin",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize() // Fill the Box
                )*/
                /*AsyncImage(
                    model = uiState.imageUri,
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )*/
                Image(
                    painter = rememberAsyncImagePainter(
                        localFile.value
                    ),
                    contentDescription = "User Profile Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                )

                Box( // The container for the Icon
                    modifier = Modifier
                        .size(34.dp) // Size of the bordered area
                        .clip(CircleShape) // Clip the Box
                        .background(Color.Black) // Background for the Box
                        .align(Alignment.BottomEnd) // Align the Box to the bottom end of the Image
                        .border(1.dp, Color.Black, CircleShape) // Border for the Box
                        .clickable(onClick = {
                            openGallery(context as Activity, launcher)
                        }),
                    contentAlignment = Alignment.Center // Center the Icon within the Box
                ) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Edit",
                        tint = Color.White,
                        modifier = Modifier
                            .size(24.dp) // Size of the Icon
                            .padding(4.dp) // Padding around the Icon
                    )
                }

            }
            Spacer(modifier = Modifier.height(32.dp))

            OutlinedTextField(
                value = uiState.name ?: "",
                readOnly = !uiState.isUpdatingProfile,
                onValueChange = { viewModel.onUiEvent(ProfileUiEvent.NameChanged(it)) },
                placeholder = { Text("Example Name") },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedLabelColor = Color.White, unfocusedTextColor =
                    Color.White, focusedTextColor = Color.White
                ),
                modifier = Modifier
                    .padding(8.dp)
                    .width(300.dp) // Or requiredWidth(200.dp) for a fixed width
                ,
                singleLine = true
            )
            OutlinedTextField(
                value = uiState.email ?: "",
                readOnly = true,
                onValueChange = { viewModel.onUiEvent(ProfileUiEvent.EmailChanged(it)) },
                placeholder = { Text("example@example.com") },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedLabelColor = Color.White, unfocusedTextColor =
                    Color.White, focusedTextColor = Color.White
                ), modifier = Modifier
                    .padding(8.dp)
                    .width(300.dp),
                singleLine = true
            )
            OutlinedTextField(
                value = "",
                readOnly = true,
                onValueChange = {},
                placeholder = { Text("******") },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedLabelColor = Color.White, unfocusedTextColor =
                    Color.White, focusedTextColor = Color.White
                ), modifier = Modifier
                    .padding(8.dp)
                    .width(300.dp),
                singleLine = true,
                visualTransformation = PasswordVisualTransformation()
            )
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = {
                    viewModel.onUiEvent(ProfileUiEvent.UpdateProfile)
                },
                modifier = Modifier
                    .padding(horizontal = 80.dp, vertical = 8.dp)
                    .fillMaxWidth()
                    .border(
                        width = 3.dp,
                        color = Color(34, 37, 44),
                        shape = RoundedCornerShape(25.dp),
                    ),
                enabled = true,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(34, 37, 44), contentColor = Color.White
                )
            ) {
                if (uiState.isUpdatingProfile) {
                    Text("Confirm")
                } else {
                    Text("Update Profile")
                }
            }
            Spacer(modifier = Modifier.weight(1f))


        }
    }
}

fun copyImageToCache(context: Context, imageUri: Uri): File? {
    return try {
        val inputStream = context.contentResolver.openInputStream(imageUri)
        val file = File(context.cacheDir, "temp_profile_image.jpg")
        val outputStream = FileOutputStream(file)

        inputStream?.copyTo(outputStream)
        inputStream?.close()
        outputStream.close()

        file
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }
}

fun openGallery(activity: Activity, launcher: ActivityResultLauncher<Intent>) {
    val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
    launcher.launch(intent)
}
