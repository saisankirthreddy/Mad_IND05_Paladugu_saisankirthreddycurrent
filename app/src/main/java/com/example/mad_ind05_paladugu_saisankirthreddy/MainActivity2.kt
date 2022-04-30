package com.example.mad_ind05_paladugu_saisankirthreddy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mad_ind05_paladugu_saisankirthreddy.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    var binding: ActivityMain2Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding?.root)

        val rowNum = intent.getStringExtra("rowNum")
        val name = intent.getStringExtra("name")
        val area = intent.getStringExtra("area")
        val map = intent.getIntExtra("map", 0)
        val flag = intent.getIntExtra("flag", 0)
        binding!!.name.text = name
        binding!!.area.text = area
        binding!!.map.setImageResource(map)
        binding!!.flag.setImageResource(flag)
    }
}