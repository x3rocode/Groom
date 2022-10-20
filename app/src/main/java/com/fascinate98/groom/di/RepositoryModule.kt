package com.fascinate98.groom.di

import com.fascinate98.groom.domain.repository.CoinRepository
import com.fascinate98.groom.domain.repository.CoinRepositoryImpl
import com.fascinate98.groom.network.RetrofitApi
import com.fascinate98.groom.network.model.mapper.CoinDetailDtoMapper
import com.fascinate98.groom.network.model.mapper.CoinDtoMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent ::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideCoinRepository(
        retrofitApi: RetrofitApi,
        coinMapper: CoinDtoMapper,
        coinDetailMapper: CoinDetailDtoMapper
    ): CoinRepository{
        return CoinRepositoryImpl(
            api = retrofitApi,
            coinDtoMapper = coinMapper,
            coinDetailDtoMapper = coinDetailMapper
        )
    }
}