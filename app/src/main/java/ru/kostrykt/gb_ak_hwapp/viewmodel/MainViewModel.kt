package ru.kostrykt.gb_ak_hwapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.kostrykt.gb_ak_hwapp.model.AppState
import java.lang.Thread.sleep

class MainViewModel()
    : ViewModel() {

    private val liveDataToObserver: MutableLiveData<AppState> = MutableLiveData()

    private var counter: Int = 0

    fun getData(): LiveData<AppState>{
        return liveDataToObserver
    }

    fun requestData(data: String) {
        liveDataToObserver.value = AppState.Loading
        Thread{
            sleep(2000)
            counter++
            liveDataToObserver.postValue(AppState.Success(data + counter))
        }.start()
    }
}