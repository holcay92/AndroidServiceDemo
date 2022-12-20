package com.example.androidservicedemo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class BackgroundService:Service() {

    init {
        Log.i("MyTag","Service has been created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("MyTag","Service has been started")
        return START_STICKY
    }

    // every time we implement a service we need to override the onBind method
    override fun onBind(p0: Intent?): IBinder? = null

    override fun onDestroy() {
        Log.i("MyTag","Service has been stopped")
        super.onDestroy()
    }
}
