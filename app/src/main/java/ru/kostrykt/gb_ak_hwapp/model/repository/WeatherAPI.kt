package ru.kostrykt.gb_ak_hwapp.model.repository

import retrofit2.Call
import retrofit2.http.*
import ru.kostrykt.gb_ak_hwapp.model.dto.WeatherDTO

private const val REQUEST_API_KEY = "X-Yandex-API-Key"

interface WeatherAPI {
    @GET("v2/informers")
    fun getWeather(
        @Header(REQUEST_API_KEY) token: String,
        @Query("lat") lat: Double,
        @Query("lon") lon: Double
    ): Call<WeatherDTO>
}


