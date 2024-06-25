package com.example.weather.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.weather.CloudyScreen
import com.example.weather.R
import com.example.weather.ui.theme.Typography
import com.example.weather.ui.theme.components.BoxDetail
import com.example.weather.ui.theme.linearColorList
import com.example.weather.viemodel.WeatherViewModel
import java.time.LocalDateTime

@Composable
fun DetailScreen(navController: NavController, weatherViewModel: WeatherViewModel = viewModel()) {
    val currentWeather by weatherViewModel.weatherCurrentData.observeAsState()
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(Color(0xFFEAEAEA))
    ) {
        Box(
            modifier = Modifier
                .height(380.dp)
                .background(
                    brush = Brush.linearGradient(linearColorList),
                    shape = RoundedCornerShape(bottomEnd = 30.dp, bottomStart = 30.dp)
                )
        ) {
            Column(
                modifier = Modifier.fillMaxSize(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(24.dp)
                ) {
                    IconButton(onClick = {
                        navController.navigate(CloudyScreen.HOMESCREEN.name)
                    }
                    ) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.back),
                            contentDescription = "Menu",
                            tint = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.width(40.dp))
                    Text(
                        text = "Ha Dong, Ha Noi",
                        style = Typography.titleMedium,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.width(40.dp))
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.detail),
                            contentDescription = "Search Icon",
                            tint = Color.White
                        )
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Image(painter = painterResource(id = R.drawable.boxcomponent), contentDescription = "null", modifier = Modifier.scale(1.5f))
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Partly Cloudy", style = Typography.labelSmall)
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "${LocalDateTime.now().month} , ${LocalDateTime.now().dayOfMonth} ${LocalDateTime.now().year}", style = Typography.titleMedium.copy(Color.White)
                )

            }
        }
        Spacer(modifier = Modifier.height(40.dp))
        Column(
          modifier = Modifier
              .padding(16.dp)
              .fillMaxSize(1f)
        ) {
        Text(text = "Detail", style = Typography.labelMedium)
         Spacer(modifier = Modifier.height(16.dp))
         Column(
             modifier = Modifier
                 .fillMaxHeight(0.5f)
                 .padding(8.dp),
             verticalArrangement = Arrangement.SpaceBetween
         ) {
             Row(
                 modifier = Modifier.fillMaxWidth(1f),
                horizontalArrangement = Arrangement.SpaceAround
             ) {
                 BoxDetail(detailText = "${currentWeather?.temperature_2m?.toInt()}\u00B0C", component = "Temperture",R.drawable.uil_temperature_three_quarter)
                 BoxDetail(detailText = "${currentWeather?.wind_speed_10m?.toInt()} km/h", component = "Wind",R.drawable.mdi_weather_windy)
             }
             Row(
                 modifier = Modifier.fillMaxWidth(1f),
                horizontalArrangement = Arrangement.SpaceEvenly
             ) {
                 BoxDetail(detailText = "${currentWeather?.rain}%", component = "Prob of rain", R.drawable.mdi_weather_hail)
                 BoxDetail(detailText = "${currentWeather?.relative_humidity_2m}%", component = "Humidity", R.drawable.humidity)
             }
         }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Tips", style = Typography.labelMedium.copy(fontSize = 16.sp))
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                horizontalArrangement = Arrangement.Absolute.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(Color.White, shape = RoundedCornerShape(30.dp))
                    .width(343.dp)
                    .height(64.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.star), contentDescription = "star icon")
                Text(text = "Its ok to hangout with your friend", style = Typography.headlineSmall)
            }
        }
    }


}

@Preview
@Composable
fun DetailScreenPreview() {
    Surface(modifier = Modifier.background(Color.White)) {
    DetailScreen(navController = rememberNavController())
    }
}