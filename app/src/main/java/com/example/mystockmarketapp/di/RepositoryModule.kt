package com.example.mystockmarketapp.di

import com.example.mystockmarketapp.data.csv.CSVParser
import com.example.mystockmarketapp.data.csv.CompanyListingsParser
import com.example.mystockmarketapp.data.csv.IntradayInfoParser
import com.example.mystockmarketapp.data.repository.StockRepositoryImpl
import com.example.mystockmarketapp.domain.model.CompanyListing
import com.example.mystockmarketapp.domain.model.IntradayInfo
import com.example.mystockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>
}