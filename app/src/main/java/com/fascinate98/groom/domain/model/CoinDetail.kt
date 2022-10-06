package com.fascinate98.groom.domain.model

data class CoinDetail(
    val market: String,
    val trade_price: Double,    //현재가
    val change: String,         //EVEN: 보합 RISE: 상승 FALL: 하락
    val timestamp: Long
)
