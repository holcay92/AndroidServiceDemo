package com.example.androidservicedemo


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androidservicedemo.BackgroundService.Companion.MARKS
import com.example.androidservicedemo.BackgroundService.Companion.NAME
import com.example.androidservicedemo.BackgroundService.Companion.TAG
import com.example.androidservicedemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val serviceIntent = Intent(this, BackgroundService::class.java)
        serviceIntent.putExtra(MARKS, 99)
        serviceIntent.putExtra(NAME, "Halil")
           binding.btnStart.setOnClickListener {
               Log.i(TAG,"Starting Service")
                startService(serviceIntent)
            }
            binding.btnStop.setOnClickListener {
                Log.i(TAG,"Stopping Service")
                stopService(serviceIntent)
            }

    }
}