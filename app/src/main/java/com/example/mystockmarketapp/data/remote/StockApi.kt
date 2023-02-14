package com.example.mystockmarketapp.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListing(
        @Query("apikey") apiKey: String
    ): ResponseBody

    companion object{
        const val API_KEY = "FNL4L4C72MT7ZTH0"
        const val BASE_URL = "https://www.alphavantage.co"
    }
}