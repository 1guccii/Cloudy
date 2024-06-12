package com.example.weather.data.remote

import kotlinx.serialization.json.JsonNames
import retrofit2.http.Field

data class WeatherDataDto(
    @Field("temperature_2m") val temperatures: List<Float>,
    @Field("relative_humidity_2m") val humiditys: List<Float>,
    @Field("rain") val rains: List<Float>,
    @Field("weather_code") val weatherCode: List<Int>,
    @Field("wind_speed_10m") val windSpeeds: List<Float>,
)