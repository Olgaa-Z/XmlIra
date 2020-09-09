package com.zelvi.xmlira

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        handler = Handler()

        handler.postDelayed(Runnable {
            var intent = intent
            intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)

            this@SplashActivity.finish()
        }, 4000)
    }
}
