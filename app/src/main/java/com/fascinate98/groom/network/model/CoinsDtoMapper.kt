package com.fascinate98.groom.network.model

import com.fascinate98.groom.domain.model.Coins
import com.fascinate98.groom.domain.util.DomainMapper

class CoinsDtoMapper: DomainMapper<CoinsDto, Coins> {

    override fun mapToDomainModel(model: CoinsDto): Coins {
        return Coins(
            market = model.market,
            korean_name = model.korean_name,
            english_name = model.english_name,
            market_warning = model.market_warning
        )
    }

    override fun mapFromDomainModel(domainModel: Coins): CoinsDto {
        return CoinsDto(
            market = domainModel.market,
            korean_name = domainModel.korean_name,
            english_name = domainModel.english_name,
            market_warning = domainModel.market_warning
        )
    }

    fun toDomainList(initial: List<CoinsDto>): List<Coins>{
        return initial.map { mapToDomainModel(it) }
    }

}