package com.example.weather.data.remote

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class WeatherResponse(
    val latitude: Double,
    val longitude: Double,
    @SerialName("generationtime_ms") val generationtime_ms: Double,
    @SerialName("utc_offset_seconds") val utc_offset_seconds: Int,
    val timezone: String,
    @SerialName("timezone_abbreviation") val timezone_abbreviation: String,
    val elevation: Int,
    val current: CurrentWeather,
    val hourly: HourlyWeatherData,
    val daily : DailyWeather,
)
