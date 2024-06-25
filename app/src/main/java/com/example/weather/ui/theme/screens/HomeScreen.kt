package com.example.weather.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.weather.CloudyScreen
import com.example.weather.R
import com.example.weather.ui.theme.Typography
import com.example.weather.ui.theme.components.BoxBasic
import com.example.weather.ui.theme.components.BoxForecastPerHour
import com.example.weather.ui.theme.components.NewsBox


@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(Color(0xFFEAEAEA))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(24.dp)
        ) {
            IconButton(onClick = {
                navController.navigate(CloudyScreen.HOMESIDEBAR.name)
            }
            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.menu),
                    contentDescription = "Menu",
                )
            }
            Spacer(modifier = Modifier.width(40.dp))
            Text(text = "Ha Dong, Ha Noi", style = Typography.titleMedium)
            Spacer(modifier = Modifier.width(40.dp))
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.gg_search),
                    contentDescription = "Search Icon"
                )
            }
        }
        Column(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxHeight(1f)
                .padding(start = 8.dp)
        ) {
            BoxBasic(navController = navController)
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "ForeCast", style = Typography.bodySmall, modifier = Modifier.padding(start = 12.dp))
            Spacer(modifier = Modifier.height(8.dp))
            BoxForecastPerHour(navController)
            Spacer(modifier = Modifier.height(32.dp))
            NewsBox()
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}

