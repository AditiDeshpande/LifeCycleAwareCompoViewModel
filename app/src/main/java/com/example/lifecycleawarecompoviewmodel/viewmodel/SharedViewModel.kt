package com.example.lifecycleawarecompoviewmodel.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    val selected = MutableLiveData<Item>()

    fun select(item: Item){
        selected.value = item
    }
}
