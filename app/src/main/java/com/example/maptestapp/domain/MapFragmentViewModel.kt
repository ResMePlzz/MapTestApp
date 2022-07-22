package com.example.maptestapp.domain


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class MapFragmentViewModel:ViewModel() {

    val repository = RetrofitCityRepository()

    fun getCity(city:String?){
        viewModelScope.launch {
            repository.getNameCity(myCity = city)

        }
    }
}