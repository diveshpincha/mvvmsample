package com.example.samplemvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Viewmodel:ViewModel() {
    private var _num=MutableLiveData<Int>()

    val num:LiveData<Int>
    get()=_num

    init{
        _num.value=1
    }

    fun onButton(){
        _num.value= _num.value?.plus(1)
    }

}