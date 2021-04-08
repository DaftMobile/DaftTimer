package com.daftmobmile.daftapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.daftmobmile.daftapp.util.EmptyLiveData

class MainViewModel : ViewModel() {

    val timeLabel: LiveData<String> = EmptyLiveData()
    val actionLabel: LiveData<String> = EmptyLiveData()

    fun onButtonClicked() = Unit
}
