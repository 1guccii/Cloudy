package com.example.weather.data.remote



import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("v1/forecast")
    suspend fun getCurrentWeatherData(
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double,
        @Query("current") current:String = "temperature_2m,relative_humidity_2m,weather_code,wind_speed_10m",
    ) : CurrentWeather
}
