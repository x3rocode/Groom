package com.fascinate98.groom.di

import com.fascinate98.groom.domain.repository.CoinRepository
import com.fascinate98.groom.network.RetrofitApi
import com.fascinate98.groom.network.model.CoinDetailDtoMapper
import com.fascinate98.groom.network.model.CoinsDtoMapper
import com.fascinate98.groom.network.repository.CoinRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent ::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideCoinRepository(
        retrofitApi: RetrofitApi,
        coinsMapper: CoinsDtoMapper,
        coinDetailMapper: CoinDetailDtoMapper
    ): CoinRepository{
        return CoinRepositoryImpl(
            api = retrofitApi,
            coinsMapper = coinsMapper,
            coinDetailMapper = coinDetailMapper
        )
    }
}