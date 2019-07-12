package com.mythio.retrofitsample.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.mythio.retrofitsample.R
import com.mythio.retrofitsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil
                .setContentView(this, R.layout.activity_main)

        binding.btnSearch.setOnClickListener {
            if (binding.etProfileName.text.isNotBlank()) {
                viewModel.getUserData(binding.etProfileName.text.toString())
            }
        }
    }
}
