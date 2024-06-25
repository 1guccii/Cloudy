package com.example.weather.ui.theme.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.weather.ui.theme.Typography
import com.example.weather.viemodel.WeatherViewModel


@Composable
fun TestScreen(weatherViewModel: WeatherViewModel = viewModel()) {

    val currentWeather by weatherViewModel.weatherCurrentData.observeAsState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        currentWeather.let { weather ->
            Text(text = weather?.temperature_2m.toString(), style = Typography.displayLarge)
            Log.d("Weather Data","temp : ${currentWeather?.temperature_2m}")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TestScreenPreview() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        TestScreen()
    }
}



