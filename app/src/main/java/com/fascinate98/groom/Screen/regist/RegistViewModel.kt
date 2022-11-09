package com.fascinate98.groom.Screen.regist
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fascinate98.groom.domain.model.Coin
import com.fascinate98.groom.domain.model.User
import com.fascinate98.groom.domain.repository.CoinRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject



class RegistViewModel  constructor(

    private val repository: CoinRepository
): ViewModel() {
    var state by mutableStateOf(
        RegistContract.State(
            coins = listOf(),
            isLoading = true,
            userInfo = User.getUser("", Coin("","","",""), 0.0)
        )
    )
    private set

    init {
        viewModelScope.launch {
            getCoins()
        }
    }

    private suspend fun getCoins(){
        val coins = repository.getCoins()
        viewModelScope.launch {
            state = state.copy(coins = coins, isLoading = false)
        }
    }
}