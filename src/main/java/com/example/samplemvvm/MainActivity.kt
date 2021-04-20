package com.example.samplemvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.samplemvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewmodel : Viewmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        val viewmodel= ViewModelProvider(this).get(Viewmodel::class.java)

        binding.button.setOnClickListener(){
            viewmodel.onButton()
        }

        viewmodel.num.observe(this,{
            binding.number.text=viewmodel.num.value.toString()
        })

        binding.mvvmclass=viewmodel
    }
}