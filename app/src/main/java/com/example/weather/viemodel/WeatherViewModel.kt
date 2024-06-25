package com.example.weather.viemodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weather.data.remote.CurrentWeather
import com.example.weather.data.remote.DailyWeather
import com.example.weather.data.remote.HourlyWeatherData
import com.example.weather.network.RetrofitClient
import kotlinx.coroutines.launch


class WeatherViewModel: ViewModel() {

    private val _weatherCurrentData =  MutableLiveData<CurrentWeather>()
    val weatherCurrentData: LiveData<CurrentWeather>
        get() = _weatherCurrentData

    private val _weatherHourlyData = MutableLiveData<HourlyWeatherData>()
    val weatherHourlyData:LiveData<HourlyWeatherData>
        get() = _weatherHourlyData

    private val _dailyWeather = MutableLiveData<DailyWeather>()
    val dailyWeather : LiveData<DailyWeather>
        get() = _dailyWeather


    init {
        viewModelScope.launch {
            try {
            fetchData(20.9852,105.9318)
            Log.d("Api","${weatherCurrentData.value?.temperature_2m}")
            }
            catch (e:Exception) {
                Log.e("Warning","${e}")
            }
        }
    }

    private fun fetchData(latitude: Double, longitude: Double) {
        viewModelScope.launch {
            try {
                val response = RetrofitClient.weatherApi.getCurrentWeatherData(latitude,longitude)
                if (response.isSuccessful) {
                    Log.d("WeatherViewModel","${response.body()}")
                    val dailyWeatherRepose = response.body()
                    val currentWeatherResponse = response.body()
                    val hourlyWeatherRepose = response.body()
                    if (currentWeatherResponse != null && hourlyWeatherRepose != null && dailyWeatherRepose != null) {
                       val currentWeather = currentWeatherResponse.current
                       val hourlyWeather = hourlyWeatherRepose.hourly
                        val dailyWeather = dailyWeatherRepose.daily
                        Log.d("WeatherViewModel", "fetchData: ${currentWeather.temperature_2m}")
                        _weatherCurrentData.value = currentWeather
                        _weatherHourlyData.value = hourlyWeather
                        _dailyWeather.value = dailyWeather
                    }
                }
            } catch (e: Exception) {
                Log.e("WeatherViewModel", "fetchData: ${e.message}")
            }
        }
    }
}