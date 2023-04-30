package com.example.happyplaceapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.happyplaceapp.R
import com.example.happyplaceapp.databinding.ActivityHappyPlaceDetailBinding

class HappyPlaceDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHappyPlaceDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHappyPlaceDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}