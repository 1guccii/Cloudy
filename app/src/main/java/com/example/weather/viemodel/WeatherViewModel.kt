package com.example.weather.viemodel




import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weather.data.remote.CurrentWeather
import com.example.weather.network.RetrofitClient
import kotlinx.coroutines.launch


// ViewModel sử dụng Retrofit để gọi API và lưu trữ dữ liệu
class WeatherViewModel : ViewModel() {
    private val _weatherData = MutableLiveData<CurrentWeather>()
    val weatherData: LiveData<CurrentWeather>
        get() = _weatherData

    fun getWeatherData(latitude: Double, longitude: Double) {
        viewModelScope.launch {
            val retrofitClient = RetrofitClient.weatherApi
            _weatherData.value = retrofitClient.getCurrentWeatherData(latitude, longitude)
        }
    }
}
