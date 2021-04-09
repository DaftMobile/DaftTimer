package com.daftmobmile.daftapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val emptyTimeLabel = "_"
    val timeLabel: MutableLiveData<String> = MutableLiveData(emptyTimeLabel)
    val buttonLabel: MutableLiveData<Int> = MutableLiveData(R.string.start_button)

    fun onButtonClicked() = Unit
}
