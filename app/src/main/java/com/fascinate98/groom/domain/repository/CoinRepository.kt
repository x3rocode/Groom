package com.fascinate98.groom.domain.repository

import com.fascinate98.groom.domain.model.CoinDetail
import com.fascinate98.groom.domain.model.Coins

interface CoinRepository {

    // api requests
    suspend fun getCoins(): List<Coins>

    suspend fun getCoinDetail(market: String): CoinDetail
}