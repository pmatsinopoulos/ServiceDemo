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
        binding.apply {
            btnStart.setOnClickListener {
                Log.i("MYTAG", "btnStart listener...")
                startService(serviceIntent)
            }

            btnStop.setOnClickListener {
                Log.i("MYTAG", "btnStop listener...")
                stopService(serviceIntent)
            }
        }
    }
}