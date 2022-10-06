package com.fascinate98.groom.network.model

import com.google.gson.annotations.SerializedName

data class CoinDetailDto (
    @SerializedName("market")
    var market: String,

    @SerializedName("trade_price")
    var trade_price: Double,

    @SerializedName("change")
    var change: String,

    @SerializedName("timestamp")
    var timestamp: Long
)