package com.example.databinding.ViewModel

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class LoginViewModel:ViewModel{
    var username =ObservableField("")
    var password =ObservableField("")

    var resultData=MutableLiveData<String>()

    constructor() : super()

    fun loginCall(usernamep:String,passwordp: String)
    {
        var result:String=""
        username.set(usernamep)
        password.set(passwordp)
        // TODO validate the username email and password with patterns

        // resultData.value=result
    }

    fun getResultLogin():MutableLiveData<String>{
        return resultData
    }
}