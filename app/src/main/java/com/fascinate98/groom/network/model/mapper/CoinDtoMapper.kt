package com.fascinate98.groom.network.model.mapper

import com.fascinate98.groom.domain.model.Coin
import com.fascinate98.groom.domain.util.DomainMapper
import com.fascinate98.groom.network.model.CoinDto

class CoinDtoMapper: DomainMapper<CoinDto, Coin> {

    override fun mapToDomainModel(model: CoinDto): Coin {
        return Coin(
            market = model.market,
            korean_name = model.korean_name,
            english_name = model.english_name,
            market_warning = model.market_warning
        )
    }

    override fun mapFromDomainModel(domainModel: Coin): CoinDto {
        return CoinDto(
            market = domainModel.market,
            korean_name = domainModel.korean_name,
            english_name = domainModel.english_name,
            market_warning = domainModel.market_warning
        )
    }

    fun toDomainList(initial: List<CoinDto>): List<Coin>{
        return initial.map { mapToDomainModel(it) }
    }

    fun fromDomainList(initial: List<Coin>): List<CoinDto>{
        return initial.map { mapFromDomainModel(it) }
    }
}