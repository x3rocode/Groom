package com.fascinate98.groom.domain.repository

import com.fascinate98.groom.domain.model.Coin
import com.fascinate98.groom.domain.model.CoinDetail
import com.fascinate98.groom.network.RetrofitApi
import com.fascinate98.groom.network.model.mapper.CoinDetailDtoMapper
import com.fascinate98.groom.network.model.mapper.CoinDtoMapper
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: RetrofitApi,
    private val coinDtoMapper: CoinDtoMapper,
    private val coinDetailDtoMapper: CoinDetailDtoMapper
): CoinRepository{
    override suspend fun getCoins(): List<Coin> {
        return coinDtoMapper.toDomainList(api.getCoins())
    }

    override suspend fun getCoinDetail(markets: String): CoinDetail {
        return coinDetailDtoMapper.mapToDomainModel(api.getCoinDetail(markets = markets))
    }
}