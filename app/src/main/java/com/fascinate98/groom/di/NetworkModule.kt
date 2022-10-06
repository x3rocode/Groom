package com.fascinate98.groom.di

import com.fascinate98.groom.network.RetrofitApi
import com.fascinate98.groom.network.model.CoinsDtoMapper
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent ::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideCoinsMapper(): CoinsDtoMapper {
        return CoinsDtoMapper()
    }

    @Singleton
    @Provides
    fun provideCoinDetailMapper(): CoinsDtoMapper {
        return CoinsDtoMapper()
    }

    @Singleton
    @Provides
    fun provideRetrofitApi(): RetrofitApi {
        return Retrofit.Builder()
            .baseUrl("https://api.upbit.com/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(RetrofitApi::class.java)
    }
}