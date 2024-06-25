package com.example.weather.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.weather.R
import com.example.weather.ui.theme.Typography
import com.example.weather.viemodel.WeatherViewModel
import java.time.LocalDateTime

@Composable
fun WeekForeCast( weatherViewModel: WeatherViewModel = viewModel()) {
    val dailyWeatherData by weatherViewModel.dailyWeather.observeAsState()
    dailyWeatherData.let { temp ->
    Column(
        modifier = Modifier.fillMaxSize(1f)
    ) {
        Text(text = "ForeCast", style = Typography.bodySmall)
        Spacer(modifier = Modifier.height(8.dp))
        Column(
            modifier = Modifier
                .height(460.dp)
                .width(340.dp)
                .background(Color(0xFFFFFFFF), shape = RoundedCornerShape(20.dp))
        ) {
            Column(
                modifier = Modifier.padding(24.dp)
            ) {
                Text(text = "Partly Cloudy", style = Typography.headlineSmall)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "${LocalDateTime.now().month} , ${LocalDateTime.now().dayOfMonth} ${LocalDateTime.now().year}", style = Typography.titleMedium)
                Spacer(modifier = Modifier.height(8.dp))
                RowForeCastPerDay(temp = "${temp?.temperature_2m_max?.get(0)?.toInt()}\u00B0C", dayOfWeek = "Monday", idPainter = R.drawable.sun)
                RowForeCastPerDay(temp = "${temp?.temperature_2m_max?.get(1)?.toInt()}°C", dayOfWeek = "Tuesday", idPainter = R.drawable.sun)
                RowForeCastPerDay(temp = "${temp?.temperature_2m_max?.get(2)?.toInt()}°C" , dayOfWeek = "Wednesday", idPainter = R.drawable.sun)
                RowForeCastPerDay(temp = "${temp?.temperature_2m_max?.get(3)?.toInt()}°C", dayOfWeek = "Thursday", idPainter = R.drawable.sun)
                RowForeCastPerDay(temp = "${temp?.temperature_2m_max?.get(4)?.toInt()}°C", dayOfWeek = "Friday", idPainter = R.drawable.sun)
                RowForeCastPerDay(temp = "${temp?.temperature_2m_max?.get(5)?.toInt()}°C", dayOfWeek = "Saturday", idPainter = R.drawable.sun)
                RowForeCastPerDay(temp = "${temp?.temperature_2m_max?.get(6)?.toInt()}°C", dayOfWeek = "Sunday", idPainter = R.drawable.sun)
            }
        }
     }
    }
}

@Preview
@Composable
fun WeekForeCastPreview() {
    Surface {
    WeekForeCast()
    }
}