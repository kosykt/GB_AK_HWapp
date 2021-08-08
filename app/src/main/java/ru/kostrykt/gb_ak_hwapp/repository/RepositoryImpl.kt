package ru.kostrykt.gb_ak_hwapp.repository

import ru.kostrykt.gb_ak_hwapp.data.Weather
import ru.kostrykt.gb_ak_hwapp.data.getRussianCities
import ru.kostrykt.gb_ak_hwapp.data.getWorldCities

class RepositoryImpl : Repository {

    override fun getWeatherFromSever() = Weather()

    override fun getWeatherFromLocalStorageRus() = getRussianCities()

    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}