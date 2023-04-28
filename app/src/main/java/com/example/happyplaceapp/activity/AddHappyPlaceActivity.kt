package com.example.happyplaceapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.happyplaceapp.R
import com.example.happyplaceapp.databinding.ActivityAddHappyPlaceBinding

class AddHappyPlaceActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddHappyPlaceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddHappyPlaceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarAddPlace)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) //back btn

        binding.toolbarAddPlace.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}