package com.example.happyplaceapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.happyplaceapp.R
import com.example.happyplaceapp.database.DatabaseHandler
import com.example.happyplaceapp.databinding.ActivityMainBinding
import com.example.happyplaceapp.model.HappyPlaceModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabAddHappyPlace.setOnClickListener{
            val intent = Intent(this,AddHappyPlaceActivity::class.java)
            startActivity(intent)
        }
        getHappyPlacesListFromLocalDb()
    }
    private fun getHappyPlacesListFromLocalDb(){
        val dbHandler = DatabaseHandler(this)
        val getHappyPlaceList :ArrayList<HappyPlaceModel> = dbHandler.getHappyPlaceLists()

        if(getHappyPlaceList.size >0){
            for(i in getHappyPlaceList){
                Log.e("TITLE",i.title)
                Log.e("Description",i.description)
            }
        }
    }
}