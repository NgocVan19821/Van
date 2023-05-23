package com.example.test

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView


class BatteryReceiver internal constructor(var tv: TextView) : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val batteryPercentage = intent.getIntExtra("level", 0)
        if (batteryPercentage != 0) {
            tv.text = "$batteryPercentage%"
        }
    }
}
