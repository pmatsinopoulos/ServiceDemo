package com.mixlr.panos.servicedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mixlr.panos.servicedemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val serviceIntent = Intent(this, MyBackgroundService::class.java)
        serviceIntent.putExtra(MyBackgroundService.NAME, "Alex")
        serviceIntent.putExtra(MyBackgroundService.MARKS, 78)
        binding.apply {
            btnStart.setOnClickListener {
                Log.i(MyBackgroundService.TAG, "btnStart listener...")
                startService(serviceIntent)
            }

            btnStop.setOnClickListener {
                Log.i(MyBackgroundService.TAG, "btnStop listener...")
                stopService(serviceIntent)
            }
        }
    }
}