package com.example.weather.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.weather.R
import com.example.weather.ui.theme.Typography
import com.example.weather.viemodel.WeatherViewModel
import java.time.LocalDateTime

@Composable
fun VerticalForecastPerHour(time : LocalDateTime, currentWeather: WeatherViewModel = viewModel(),indexTime: LocalDateTime) {

    val hourlyWeather by currentWeather.weatherHourlyData.observeAsState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(color = Color(0xFFFFFFFF)),
    ) {
        hourlyWeather.let { hourlyWeatherData ->
            Text(text = "${time.hour}:00", style = Typography.titleSmall, color = Color.Black)
            Spacer(modifier = Modifier.height(16.dp))
            Image(painter = painterResource(id = R.drawable.sun), contentDescription = "Sun")
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "${hourlyWeatherData?.temperature_2m?.get(indexTime.hour)?.toInt().toString()}°C",
                style = Typography.bodySmall.copy(fontFamily = FontFamily(Font(R.font.poppins_regular)))
            )
        }
    }
}

@Preview
@Composable
fun PreviewVerticalForecastPerHour() {
    VerticalForecastPerHour(time = LocalDateTime.now(), indexTime = LocalDateTime.now())
}