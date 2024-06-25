package com.example.weather.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weather.R
import com.example.weather.ui.theme.Typography

@Composable
fun BoxDetail(
    detailText: String,
    component: String,
    idIcon:Int
              ) {
    Row(
        horizontalArrangement = Arrangement.Absolute.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .height(76.dp)
            .width(166.dp)
            .background(Color.White, shape = RoundedCornerShape(20.dp))
    ) {
        Icon(painter = painterResource(id = idIcon), contentDescription = "Hail Weather")
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = detailText, style = Typography.titleMedium.copy(color = Color(0xFF363B64)))
            Text(text = component, style = Typography.headlineMedium)
        }
    }
}

@Preview
@Composable
fun BoxDetailPreview() {
    Surface(modifier = Modifier.background(Color.White)) {
            BoxDetail("72", "Humidity", R.drawable.icon8_humidity)
    }
}

