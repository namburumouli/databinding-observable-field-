package com.example .databinding


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.ViewModelProviders.of
import com.example.databinding.Presenter.Presenter
import com.example.databinding.ViewModel.LoginViewModel
import com.example.databinding.databinding.ActivityMainBinding
import java.util.EnumSet.of


class MainActivity: AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title="Demo App"
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        var   viewmodel = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        viewmodel.getResultLogin().observe(this , Observer {  }) //TODO -> display message toast if success 
        binding!!.presenter=object :Presenter{
            override fun login() {
                // TODO -> validate
                var name:String=binding.email.text.toString()
                var password:String=binding.password.text.toString()
                viewmodel.loginCall(name,password)
            }

        }

            }


        }
