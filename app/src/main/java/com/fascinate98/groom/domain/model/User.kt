package com.fascinate98.groom.domain.model

import javax.inject.Singleton

@Singleton
data class User(
    val name: String,
    val coin: Coin,
    val price: Double
) {
    companion object{
        @Volatile
        @JvmStatic
        private var userInfo: User? = null

        @JvmStatic
        @JvmOverloads
        fun getUser(name: String, coin: Coin, price: Double): User = userInfo?: synchronized(this) {
            userInfo ?: User(name, coin, price).also { userInfo = it }
        }
    }
}
