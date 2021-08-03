package ru.kostrykt.gb_ak_hwapp.repository

import ru.kostrykt.gb_ak_hwapp.data.Weather
import ru.kostrykt.gb_ak_hwapp.data.getRussianCities
import ru.kostrykt.gb_ak_hwapp.data.getWorldCities

class RepositoryImpl: Repository {
    override fun getWeatherFromSever(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocalStorageRus(): List<Weather> {
        return getRussianCities()
    }

    override fun getWeatherFromLocalStorageWorld(): List<Weather> {
        return getWorldCities()
    }


}