package com.fascinate98.groom.network

import com.fascinate98.groom.network.model.CoinDetailDto
import com.fascinate98.groom.network.model.CoinsDto
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface RetrofitApi {

    @GET("v1/market/all")
    suspend fun getCoins(
        @Query("isDetails") isDetails: String = "true"
    ): List<CoinsDto>

    @GET("v1/ticker")
    suspend fun getCoinDetail(
        @Header("accept") accept: String = "application/json",
        @Query("markets") markets: String
    ): CoinDetailDto
}