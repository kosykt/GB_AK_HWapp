package ru.kostrykt.gb_ak_hwapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.kostrykt.gb_ak_hwapp.model.AppState
import ru.kostrykt.gb_ak_hwapp.repository.Repository
import ru.kostrykt.gb_ak_hwapp.repository.RepositoryImpl
import java.lang.Thread.sleep

class MainViewModel(private val repository: Repository = RepositoryImpl()) : ViewModel() {

    private val liveDataToObserver: MutableLiveData<AppState> = MutableLiveData()

    private var counter: Int = 0

    fun getData(): LiveData<AppState>{
        return liveDataToObserver
    }

    fun getWeatherFromLocalSource(){
        liveDataToObserver.value = AppState.Loading
        Thread{
            sleep(500)
            counter++
            liveDataToObserver.postValue(AppState.Success(repository.getWeatherFromLocalSource()))
        }.start()
    }

    fun getWeatherFromRemoteSource(){
        liveDataToObserver.value = AppState.Loading
        Thread{
            sleep(2000)
            counter++
            liveDataToObserver.postValue(AppState.Success(repository.getWeatherFromSever()))
        }.start()
    }
}