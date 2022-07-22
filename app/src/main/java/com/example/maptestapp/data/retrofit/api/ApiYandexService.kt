package com.example.maptestapp.data.retrofit.api

import com.example.maptestapp.API_JSON
import com.example.maptestapp.domain.MapKitModel.CountryModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiYandexService {
    @GET("?format=json&apikey=$API_JSON")
    suspend fun getMyCity(@Query("geocode") city: String?
    ):Response<CountryModel>
}
