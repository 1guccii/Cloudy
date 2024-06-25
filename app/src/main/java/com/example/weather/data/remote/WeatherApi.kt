package com.example.weather.data.remote




import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("v1/forecast?current=temperature_2m,relative_humidity_2m,weather_code,wind_speed_10m")
    suspend fun getCurrentWeatherData(
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double,
    ) : Response<CurrentWeatherResponse>
}

