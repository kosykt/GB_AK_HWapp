package ru.kostrykt.gb_ak_hwapp.model

import ru.kostrykt.gb_ak_hwapp.data.Weather

sealed class AppState{
    data class Success(val weatherData: List<Weather>): AppState()
    class Error(val error: Throwable): AppState()
    object Loading: AppState()
}
