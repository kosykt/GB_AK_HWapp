package ru.kostrykt.gb_ak_hwapp.model.repository

import ru.kostrykt.gb_ak_hwapp.model.data.Weather

interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorageRus(): List<Weather>
    fun getWeatherFromLocalStorageWorld(): List<Weather>
}