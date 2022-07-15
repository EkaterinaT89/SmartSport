package ru.smartsport.presentation.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class ViewModel: ViewModel() {
    private var _data: MutableLiveData<MutableList<SportsEvents>> = MutableLiveData()
    val data: MutableLiveData<MutableList<SportsEvents>> = _data

    init {
        data.value = mutableListOf(
            SportsEvents("05 авг.  10:30","Футбол"),
            SportsEvents("10 авг.  14:15","Тенис"),
        )
    }

    fun addSportsEvents(title:String){
        data.value!!.add(SportsEvents("14 июл. 10:30", title))
    }
}

data class SportsEvents(
    val date: String,
    val nameSport: String
)