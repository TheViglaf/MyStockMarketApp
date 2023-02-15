package com.example.mystockmarketapp.domain.repository

import com.example.mystockmarketapp.domain.model.CompanyListing
import com.example.mystockmarketapp.utils.Resource
import kotlinx.coroutines.flow.Flow


interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}