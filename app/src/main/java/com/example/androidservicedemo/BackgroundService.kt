package com.example.androidservicedemo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class BackgroundService:Service() {

    init {
        Log.i(TAG,"Service has been created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i(TAG,"Service has been started")
        val name = intent?.getStringExtra(NAME)
        val marks = intent?.getIntExtra(MARKS,0)
        Log.i(TAG,"Name: $name , Marks: $marks")

        return START_STICKY
    }

    // every time we implement a service we need to override the onBind method
    override fun onBind(p0: Intent?): IBinder? = null

    override fun onDestroy() {
        Log.i(TAG,"Service has been stopped")
        super.onDestroy()
    }

    companion object{
        const val TAG = "MyTag"
        const val NAME = "NAME"
        const val MARKS= "MARKS"
    }
}
