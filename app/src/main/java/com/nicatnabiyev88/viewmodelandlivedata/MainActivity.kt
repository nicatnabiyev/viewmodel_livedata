package com.nicatnabiyev88.viewmodelandlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.nicatnabiyev88.viewmodelandlivedata.databinding.ActivityMainBinding
import com.nicatnabiyev88.viewmodelandlivedata.viewmodel.MyViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

            val viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
            binding.viewmodel = viewModel
            binding.lifecycleOwner = this

        binding.btn.setOnClickListener{
            viewModel.increase()
        }
    }
}