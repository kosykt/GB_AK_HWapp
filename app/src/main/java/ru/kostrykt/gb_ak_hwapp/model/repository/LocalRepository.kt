package ru.kostrykt.gb_ak_hwapp.model.repository

import ru.kostrykt.gb_ak_hwapp.model.data.Weather

interface LocalRepository {
    fun getAllHistory(): List<Weather>
    fun saveEntity(weather: Weather)
}