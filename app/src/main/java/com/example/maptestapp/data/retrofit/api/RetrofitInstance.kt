package com.example.maptestapp.data.retrofit.api

import com.example.maptestapp.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api:ApiYandexService by lazy {
        retrofit.create(ApiYandexService::class.java)



    }

}