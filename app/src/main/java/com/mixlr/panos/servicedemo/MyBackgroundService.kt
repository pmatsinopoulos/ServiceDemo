package com.mixlr.panos.servicedemo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyBackgroundService: Service() {
    init {
        Log.i("MYTAG", "Service has been created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("MYTAG", "Service started")
        return START_STICKY
    }

    override fun onDestroy() {
        Log.i("MYTAG", "Destroying service...")
        super.onDestroy()
    }
    override fun onBind(intent: Intent?): IBinder? = null
}