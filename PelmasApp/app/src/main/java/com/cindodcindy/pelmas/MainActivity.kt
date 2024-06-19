package com.cindodcindy.pelmas

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            // Navigate to the main activity
            val intent = Intent(this, PelmasHome::class.java)
            startActivity(intent)
            finish() // Finish this activity so the user cannot return to the splash screen
        }, 3000)


    }
}

