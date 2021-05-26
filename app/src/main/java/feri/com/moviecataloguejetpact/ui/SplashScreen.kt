package feri.com.moviecataloguejetpact.ui;

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import feri.com.moviecataloguejetpact.databinding.ActivitySplashScreenBinding
import feri.com.moviecataloguejetpact.ui.movie_tv_fitur.MainActivity

class SplashScreen : AppCompatActivity() {

    lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.avi.show()
        Handler(mainLooper).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            binding.avi.hide()
            finish()
        }, 2000)
    }
}