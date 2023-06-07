package com.mixlr.panos.servicedemo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyBackgroundService: Service() {
    init {
        Log.i(TAG, "Service has been created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i(TAG, "Service started")
        val name = intent?.getStringExtra(NAME)
        val marks = intent?.getIntExtra(MARKS, 0)

        Log.i(TAG, "name is $name, marks is $marks")
        return START_STICKY
    }

    override fun onDestroy() {
        Log.i(TAG, "Destroying service...")
        super.onDestroy()
    }
    override fun onBind(intent: Intent?): IBinder? = null

    companion object {
        const val TAG = "MYTAG"
        const val NAME = "NAME"
        const val MARKS = "MARKS"
    }
}