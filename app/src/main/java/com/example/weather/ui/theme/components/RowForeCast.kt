package com.example.weather.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
fun RowForeCastPerDay(idPainter:Int,temp: String,dayOfWeek: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(start = 24.dp, end = 24.dp, top = 6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(painter = painterResource(id = idPainter), contentDescription = "Image ")
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = dayOfWeek, style = Typography.titleSmall.copy(color = Color.Black))
        Spacer(modifier = Modifier.weight(1f))
        Text(text = temp, style = Typography.bodySmall)
    }
}



@Preview
@Composable
fun RowForeCastPreview() {
    Surface(modifier = Modifier.background(Color.White)) {
        RowForeCastPerDay(idPainter = R.drawable.sun, temp ="34" , dayOfWeek = "32")
    }
}