package com.fascinate98.groom.network.repository

import com.fascinate98.groom.di.RepositoryModule
import com.fascinate98.groom.domain.model.CoinDetail
import com.fascinate98.groom.domain.model.Coins
import com.fascinate98.groom.domain.repository.CoinRepository
import com.fascinate98.groom.network.RetrofitApi
import com.fascinate98.groom.network.model.CoinDetailDto
import com.fascinate98.groom.network.model.CoinDetailDtoMapper
import com.fascinate98.groom.network.model.CoinsDto
import com.fascinate98.groom.network.model.CoinsDtoMapper
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: RetrofitApi,
    private val coinsMapper: CoinsDtoMapper,
    private val coinDetailMapper: CoinDetailDtoMapper
): CoinRepository{

    override suspend fun getCoins(): List<Coins> {
        return coinsMapper.toDomainList(api.getCoins())
    }

    override suspend fun getCoinDetail(market: String): CoinDetail {
        return coinDetailMapper.mapToDomainModel(api.getCoinDetail(markets = market))
    }

}