package com.example.weather.domain.weather

import androidx.annotation.DrawableRes
import com.example.weather.R


sealed class WeatherType (
    val weatherDesc: String,
    @DrawableRes weatherTypeImg: Int
) {
    data object Sunny : WeatherType(
        weatherDesc = "Clear sky",
        weatherTypeImg = R.drawable.sun
    )
    data object OverCast : WeatherType(
        weatherDesc = "Overcast",
        weatherTypeImg = R.drawable.cloud
    )
    data object Rain : WeatherType(
        weatherDesc = "Rain",
        weatherTypeImg = R.drawable.rain
    )
    data object PartyCloudy : WeatherType(
        weatherDesc = "Party cloudy",
        weatherTypeImg = R.drawable.boxcomponent
    )
    data object SunShowers : WeatherType(
        weatherDesc = "Sun showers",
        weatherTypeImg = R.drawable.sunandrain
    )
    companion object {
        private fun getWeatherType(weatherCode:Int): WeatherType {
            when (weatherCode) {
                0 -> Sunny
                2 -> OverCast
                3 -> PartyCloudy
                63,65 -> Rain
                61 -> SunShowers
            }
            return WeatherType.getWeatherType(weatherCode)
        }
    }
}
