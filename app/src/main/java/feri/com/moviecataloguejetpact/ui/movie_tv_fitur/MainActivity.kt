package feri.com.moviecataloguejetpact.ui.movie_tv_fitur

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import feri.com.moviecataloguejetpact.R
import feri.com.moviecataloguejetpact.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var navView: NavController
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navView = findNavController(R.id.fragment)
        binding.bottomNavigationView.setupWithNavController(navView)
    }

    fun changePage(i: Int, bundle: Bundle) {
        navView.navigate(i, bundle);
    }

}