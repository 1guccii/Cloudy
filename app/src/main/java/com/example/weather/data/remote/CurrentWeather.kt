package com.example.weather.data.remote

import com.google.gson.annotations.SerializedName

data class CurrentWeather(
    @SerializedName("time") val time : String,
    @SerializedName("temperature_2m") val temperature2m : Double,
    @SerializedName("weather_code") val weatherCode : Int,
    @SerializedName("wind_speed_10m") val windSpeed10m : Double,
    @SerializedName("relative_humidity_2m") val relativeHumidity2m : Double
)