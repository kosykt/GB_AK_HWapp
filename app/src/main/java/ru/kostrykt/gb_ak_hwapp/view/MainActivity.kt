package ru.kostrykt.gb_ak_hwapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.kostrykt.gb_ak_hwapp.R
import ru.kostrykt.gb_ak_hwapp.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(binding.container.id, MainFragment.newInstance())
                .commitNow()
        }
    }
}