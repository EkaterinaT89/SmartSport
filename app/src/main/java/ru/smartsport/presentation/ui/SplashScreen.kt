package ru.smartsport.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import ru.smartsport.R
import ru.smartsport.presentation.MainActivity

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {

    private val delayHandler: Handler = Handler(Looper.getMainLooper())

    companion object {
        private const val SPLASH_DELAY: Long = 3000
    }

    private val runnable: Runnable = Runnable {
        if (!isFinishing) {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        delayHandler.postDelayed(runnable, SPLASH_DELAY)
    }

    public override fun onDestroy() {
        delayHandler.removeCallbacks(runnable)
        super.onDestroy()
    }

}