package ru.kostrykt.gb_ak_hwapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.kostrykt.gb_ak_hwapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}