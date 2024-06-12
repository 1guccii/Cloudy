package com.example.weather.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

private const val baseURL = "v1/forecast?&hourly=temperature_2m,relative_humidity_2m,rain,wind_speed_10m,weather_code&timezone=Asia%2FBangkok"
interface WeatherApi {
    @GET(baseURL)
    suspend fun getWeatherData(
        @Query ("latitude") latitude: Double,
        @Query ("longitude") longitude: Double,
        )
}