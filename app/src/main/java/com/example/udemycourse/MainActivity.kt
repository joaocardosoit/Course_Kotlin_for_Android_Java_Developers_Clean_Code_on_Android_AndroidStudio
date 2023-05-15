package com.example.udemycourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.udemycourse.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_description.text = getString(R.string.a_refreshin_glass_of_water_gets_you_hydrated)
        tv_title.text = getString(R.string.drink_water)
        iv_icon.setImageResource(R.drawable.water)
    }
}