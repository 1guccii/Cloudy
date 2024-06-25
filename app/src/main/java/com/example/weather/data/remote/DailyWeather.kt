package com.example.weather.data.remote

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DailyWeather(
    @SerialName("temperature_2m_max") val temperature_2m_max: List<Double>
)
