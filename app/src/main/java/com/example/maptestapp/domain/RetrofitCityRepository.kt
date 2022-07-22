package com.example.maptestapp.domain

import com.example.maptestapp.data.retrofit.api.RetrofitInstance
import com.example.maptestapp.domain.MapKitModel.CountryModel
import retrofit2.Response

class RetrofitCityRepository {

    suspend fun getNameCity(myCity:String?):Response<CountryModel>{
        return RetrofitInstance.api.getMyCity(city = myCity)
    }
}