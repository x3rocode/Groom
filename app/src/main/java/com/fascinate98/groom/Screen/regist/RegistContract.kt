package com.fascinate98.groom.Screen.regist

import com.fascinate98.groom.domain.model.Coin

class RegistContract {
    data class State(
        val coins: List<Coin>
    )
}