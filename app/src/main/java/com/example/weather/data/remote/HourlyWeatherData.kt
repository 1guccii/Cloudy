package com.example.weather.data.remote

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyWeatherData(
    val time: List<String>,
    @SerialName("temperature_2m") val temperature_2m : List<Double>,
    @SerialName("relative_humidity_2m") val relative_humidity_2m : List<Double>,
    @SerialName("weather_code") val weather_code : List<Int>,
    @SerialName("wind_speed_10m") val wind_speed_10m : List<Double>
)
