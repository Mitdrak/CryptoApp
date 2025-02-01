package com.example.cryptoapp.ui.screen.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel(){
    private val _name = MutableStateFlow("")
    val name : StateFlow<String> = _name
    private val _surname = MutableStateFlow("")
    val surname : StateFlow<String> = _surname

    fun changeName(newString: String) {
        _name.value = newString
    }
    fun changeSurName(newString: String) {
        _surname.value = newString
    }
}