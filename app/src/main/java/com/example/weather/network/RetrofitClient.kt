package com.example.weather.network





import com.example.weather.data.remote.WeatherApi
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


object RetrofitClient {
        private val moshi = Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build()
        private const val BASE_URL = "https://api.open-meteo.com/"
        private val retrofit= Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build()

        val weatherApi: WeatherApi by lazy {
                retrofit.create(WeatherApi::class.java)
        }
}





