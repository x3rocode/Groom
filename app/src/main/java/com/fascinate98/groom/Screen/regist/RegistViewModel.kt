package com.fascinate98.groom.Screen.regist

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fascinate98.groom.domain.model.Coin
import com.fascinate98.groom.domain.repository.CoinRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject


@HiltViewModel
class RegistViewModel @Inject constructor(
    private val repository: CoinRepository,
    private val savedStateHandle: SavedStateHandle
): ViewModel() {

    val coin: MutableState<List<Coin>> = mutableStateOf(ArrayList())
    init{
        getCoins()
    }

    private fun getCoins(){
        viewModelScope.launch {
            try{
                //coins.value =  repository.getCoins()
            }catch(e: Exception){
                Log.e(TAG, "launchJob: Exception: ${e}, ${e.cause}")
                e.printStackTrace()
            }
        }
    }
}