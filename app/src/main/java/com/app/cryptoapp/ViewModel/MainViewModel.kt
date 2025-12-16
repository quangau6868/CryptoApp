package com.app.cryptoapp.ViewModel

import androidx.lifecycle.ViewModel
import com.app.cryptoapp.Repository.MainRepository

class MainViewModel(val repository:MainRepository):ViewModel() {

    constructor():this (MainRepository())

    fun loadData() = repository.items

}