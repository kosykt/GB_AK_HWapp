package ru.kostrykt.gb_ak_hwapp.model.repository

import ru.kostrykt.gb_ak_hwapp.model.data.Weather
import ru.kostrykt.gb_ak_hwapp.model.data.getRussianCities
import ru.kostrykt.gb_ak_hwapp.model.data.getWorldCities

class RepositoryImpl : Repository {
    override fun getWeatherFromServer() = Weather()
    override fun getWeatherFromLocalStorageRus() = getRussianCities()
    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}