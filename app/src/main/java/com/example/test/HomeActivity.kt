package com.example.test

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.tvBattery

class HomeActivity : AppCompatActivity() {
    lateinit var receiver: BatteryReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val batteryReceiver = BatteryReceiver(tvBattery)
        registerReceiver(batteryReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))

    }
    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}