package ru.kostrykt.gb_ak_hwapp.repository

import ru.kostrykt.gb_ak_hwapp.data.Weather

interface Repository {
    fun getWeatherFromSever(): Weather
    fun getWeatherFromLocalSource(): Weather

}