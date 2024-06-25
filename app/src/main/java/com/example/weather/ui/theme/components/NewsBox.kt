package com.example.weather.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weather.R
import com.example.weather.ui.theme.Typography
import com.example.weather.ui.theme.linearColorList

@Composable
fun NewsBox() {
    Column(
        modifier = Modifier
            .width(325.dp)
            .height(220.dp)
            .background(Color.White, shape = RoundedCornerShape(20.dp))
    ) {

        Column(
            modifier = Modifier.fillMaxWidth(1f)
        ) {
            Image(
                painter = painterResource(id = R.drawable.news),
                contentDescription = "New Image",
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)),
            )
        }
        Column(
            modifier = Modifier
                .padding(start = 24.dp, top = 32.dp, end = 16.dp)
                .fillMaxSize(1f)
        ) {
            Text(text = stringResource(id = R.string.new_information), style = Typography.bodySmall)
        }
    }
}

@Preview
@Composable
fun NewsBoxPreview() {
    NewsBox()
}