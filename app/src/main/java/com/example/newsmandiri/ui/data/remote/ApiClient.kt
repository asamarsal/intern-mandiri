package com.example.newsmandiri.ui.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private const val BASE_URL = "https://newsapi.org/v2/"
    fun create(): ApiServices{
        val retrofit = Retrofit.Builder
            .baseUrl(BASE_URL)
            .addConverterFactory { GsonConverterFactory.create()}
            .client {okHttpClient()}
            .build()

        return retrofit.create(ApiServices::class.java)
    }
    private fun okHttpClient():{

    }
    fun create(): ApiServices{

    }
}