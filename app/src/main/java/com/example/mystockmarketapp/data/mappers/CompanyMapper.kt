package com.example.mystockmarketapp.data.mappers

import com.example.mystockmarketapp.data.local.CompanyListingEntity
import com.example.mystockmarketapp.data.remote.dto.CompanyInfoDto
import com.example.mystockmarketapp.domain.model.CompanyInfo
import com.example.mystockmarketapp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing{
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity{
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo{
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}