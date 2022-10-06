package com.fascinate98.groom.network.model

import com.google.gson.annotations.SerializedName

data class CoinsDto(
    @SerializedName("market")
    var market: String,

    @SerializedName("korean_name")
    var korean_name: String,

    @SerializedName("english_name")
    var english_name: String,

    @SerializedName("market_warning")
    var market_warning: String
)
