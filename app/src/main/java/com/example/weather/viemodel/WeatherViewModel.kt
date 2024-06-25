package com.example.weather.viemodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weather.data.remote.CurrentWeather
import com.example.weather.network.RetrofitClient
import kotlinx.coroutines.launch


class WeatherViewModel : ViewModel() {
    private val _weatherData =  MutableLiveData<CurrentWeather>()
    val weatherData: LiveData<CurrentWeather>
        get() = _weatherData

    private val latitude = 20.625
    private val longitude = 106.125
    fun fetchData() {
        viewModelScope.launch {
            try {
            val response = RetrofitClient.weatherApi.getCurrentWeatherData(latitude,longitude)
            if (response.isSuccessful) {
                Log.d("WeatherViewModel", "fetchData: ${response.body()}")
                _weatherData.value = response.body()?.current
            }
            else {
                Log.e("WeatherViewModel", "fetchData: ${response.errorBody()?.string()} ")
                }
            }
            catch (e : Exception) {
                e.printStackTrace()
            }
        }
    }
}