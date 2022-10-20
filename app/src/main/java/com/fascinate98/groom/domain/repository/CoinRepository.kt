package com.fascinate98.groom.domain.repository
import com.fascinate98.groom.domain.model.CoinDetail
import com.fascinate98.groom.domain.model.Coin

interface CoinRepository {

    suspend fun getCoins(): List<Coin>
    suspend fun getCoinDetail(markets: String): CoinDetail
}