package ru.kostrykt.gb_ak_hwapp.model

sealed class AppState{
    data class Success(val weatherData: String): AppState()
    class Error(val error: Throwable): AppState()
    object Loading: AppState()
}
