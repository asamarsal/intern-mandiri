package com.example.newsmandiri.ui.data.remote

import com.example.newsmandiri.ui.data.response.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiServices {

    @GET "top-headlines?country=id&apiKey=4c1d61b4d4ee439c996c02b00e98066e"
    fun getNews : Call NewsResponse

}