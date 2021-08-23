package ru.kostrykt.gb_ak_hwapp.model.repository

import ru.kostrykt.gb_ak_hwapp.model.data.Weather
import ru.kostrykt.gb_ak_hwapp.model.data.convertHistoryEntityToWeather
import ru.kostrykt.gb_ak_hwapp.model.data.convertWeatherToEntity
import ru.kostrykt.gb_ak_hwapp.room.HistoryDao

class LocalRepositoryImpl(private val localDataSource: HistoryDao) : LocalRepository {
    override fun getAllHistory(): List<Weather> {
        return convertHistoryEntityToWeather(localDataSource.all())
    }

    override fun saveEntity(weather: Weather) {
        return localDataSource.insert(convertWeatherToEntity(weather))
    }
}