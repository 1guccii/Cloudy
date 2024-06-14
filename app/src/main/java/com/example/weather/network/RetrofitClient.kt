package com.example.weather.network





import com.example.weather.data.remote.WeatherApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
        private const val BASE_URL = "https://api.open-meteo.com/"

        private val retrofit: Retrofit by lazy {
                Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
        }

        val weatherApi: WeatherApi by lazy {
                retrofit.create(WeatherApi::class.java)
        }
}





