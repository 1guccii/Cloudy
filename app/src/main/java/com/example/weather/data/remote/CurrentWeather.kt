package com.example.weather.data.remote

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class CurrentWeather(
    @SerialName("temperature_2m") val temperature_2m : Double,
    @SerialName("relative_Humidity_2m") val relative_humidity_2m : Int,
    @SerialName("weather_Code") val weather_code : Int,
    @SerialName("windSpeed10m") val wind_speed_10m : Double,
    val rain: Int
)