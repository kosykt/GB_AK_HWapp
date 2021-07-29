package ru.kostrykt.gb_ak_hwapp.repository

import ru.kostrykt.gb_ak_hwapp.data.Weather

class RepositoryImpl: Repository {
    override fun getWeatherFromSever(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocalSource(): Weather {
        return Weather()
    }

}