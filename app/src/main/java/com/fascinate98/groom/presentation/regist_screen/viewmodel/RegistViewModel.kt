package com.fascinate98.groom.presentation.regist_screen.viewmodel

import android.app.Activity
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.fascinate98.groom.domain.model.Coins
import com.fascinate98.groom.domain.repository.CoinRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@ExperimentalCoroutinesApi
@HiltViewModel
class RegistViewModel @Inject constructor(
    private val coinsRepository: CoinRepository
): ViewModel() {
    val coins: MutableState<List<Coins>> = mutableStateOf(ArrayList())
    val name: String = ""

}