package com.fascinate98.groom.Screen.regist

import com.fascinate98.groom.domain.model.Coin
import com.fascinate98.groom.domain.model.User

class RegistContract {
    data class State(
        val coins: List<Coin> = listOf(),
        val isLoading: Boolean = false,
        val userInfo: User
    )
}