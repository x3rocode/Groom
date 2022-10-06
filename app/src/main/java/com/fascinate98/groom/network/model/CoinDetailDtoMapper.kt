package com.fascinate98.groom.network.model

import com.fascinate98.groom.domain.model.CoinDetail
import com.fascinate98.groom.domain.util.DomainMapper

class CoinDetailDtoMapper: DomainMapper<CoinDetailDto, CoinDetail>{

    override fun mapToDomainModel(model: CoinDetailDto): CoinDetail {
        return CoinDetail(
            market = model.market,
            trade_price = model.trade_price,
            change = model.change,
            timestamp = model.timestamp
        )
    }

    override fun mapFromDomainModel(domainModel: CoinDetail): CoinDetailDto {
        return CoinDetailDto(
            market = domainModel.market,
            trade_price = domainModel.trade_price,
            change = domainModel.change,
            timestamp = domainModel.timestamp
        )
    }

}