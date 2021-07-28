package ru.kostrykt.gb_ak_hwapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.lang.Thread.sleep

class MainViewModel(private val liveDataToObserver: MutableLiveData<Any> = MutableLiveData())
    : ViewModel() {

    fun getData(): LiveData<Any>{
        getDataFromLocalSource()
        return liveDataToObserver
    }

    private fun getDataFromLocalSource() {
        Thread{
            sleep(2000)
            liveDataToObserver.postValue(Any())
        }.start()
    }
}