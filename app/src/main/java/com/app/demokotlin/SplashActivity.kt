package com.app.demokotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    val SPLASH_TIME : Long = 3000

    val mHandler = Handler()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        startSplash()
    }

    private fun startSplash() {

        mHandler.postDelayed({

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }, SPLASH_TIME)

    }

    override fun onStop() {
        super.onStop()

        mHandler.removeCallbacksAndMessages(null)
    }
}
