package com.example.maptestapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.example.maptestapp.MAIN
import com.example.maptestapp.R
import com.example.maptestapp.databinding.ActivityMainBinding
import com.yandex.mapkit.MapKitFactory


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController
    companion object{
        const val API_KEY = "05fdfd77-0bb3-4de1-bc6d-01667358c983"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapKitFactory.setApiKey(API_KEY)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
        MAIN = this
        navController = Navigation.findNavController(this, R.id.nav_host)

        binding.bottomNav.setupWithNavController(navController)



    }
}