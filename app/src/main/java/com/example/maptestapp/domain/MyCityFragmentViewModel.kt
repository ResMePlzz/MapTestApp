package com.example.maptestapp.domain

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.maptestapp.domain.MapKitModel.Component
import com.example.maptestapp.domain.MapKitModel.CountryModel
import com.example.maptestapp.domain.MapKitModel.GeoObjectCollection
import kotlinx.coroutines.launch
import retrofit2.Response

class MyCityFragmentViewModel():ViewModel() {
    val repository = RetrofitCityRepository()

    val myCity: MutableLiveData<Response<List<Component>>> = MutableLiveData()

//    fun getMyCity(city:String?){
//        viewModelScope.launch {
//            myCity.value = repository.getNameCity(myCity = city)
//        }
   // }


}