package com.nicatnabiyev88.viewmodelandlivedata.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    private val _progress = MutableLiveData(0)
    val progress:LiveData<Int> = _progress

    private val _progressPercent = MutableLiveData("0%")
    val progressPercent:LiveData<String> = _progressPercent

    fun increase(){
        if (_progress.value!! < 100){
            _progress.value = (_progress.value?:0) + 20
            _progressPercent.value = ""+_progress.value+"%"
            Log.i("myMessage",""+_progress.value)
        }
    }
}