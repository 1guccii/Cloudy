package com.example.weather.data.remote

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class CurrentWeather(
    @SerialName("time") val time: String,
    @SerialName("interval") val interval: String,
    @SerialName("temperature_2m") val temperature2m : Double,
    @SerialName("relative_humidity_2m") val relativeHumidity2m : Double,
    @SerialName("weather_code") val weatherCode : Int,
    @SerialName("wind_speed_10m") val windSpeed10m : Double,
)