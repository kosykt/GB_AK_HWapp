package ru.kostrykt.gb_ak_hwapp.model.data

import ru.kostrykt.gb_ak_hwapp.model.dto.WeatherDTO
import ru.kostrykt.gb_ak_hwapp.room.HistoryEntity

fun convertDtoToModel(weatherDTO: WeatherDTO): List<Weather> {
    val fact = weatherDTO.fact!!
    return listOf(
        Weather(
            getDefaultCity(),
            fact.temp!!,
            fact.feels_like!!,
            fact.condition!!
        )
    )
}

fun convertHistoryEntityToWeather(entityList: List<HistoryEntity>): List<Weather> {
    return entityList.map {
        Weather(City(it.city, 0.0, 0.0), it.temperature, 0, it.condition)
    }
}

fun convertWeatherToEntity(weather: Weather): HistoryEntity {
    return HistoryEntity(0, weather.city.city, weather.temperature, weather.condition)
}