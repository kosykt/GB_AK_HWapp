package ru.kostrykt.gb_ak_hwapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.kostrykt.gb_ak_hwapp.app.App.Companion.getHistoryDao
import ru.kostrykt.gb_ak_hwapp.model.AppState
import ru.kostrykt.gb_ak_hwapp.model.repository.LocalRepository
import ru.kostrykt.gb_ak_hwapp.model.repository.LocalRepositoryImpl

class HistoryViewModel(
    val historyLiveData: MutableLiveData<AppState> = MutableLiveData(),
    private val historyRepository: LocalRepository = LocalRepositoryImpl(getHistoryDao())
) : ViewModel() {

    fun getAllHistory(){
        historyLiveData.value = AppState.Loading
        historyLiveData.value = AppState.Success(historyRepository.getAllHistory())
    }
}