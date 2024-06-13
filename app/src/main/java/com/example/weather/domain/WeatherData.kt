package com.example.weather.domain

import java.time.LocalDateTime

data class WeatherData(
    val time: LocalDateTime,
    val humidity: Int,
    val temperature: Double,
    val windSpeed: Double,
    val weatherCode:Int,

)
