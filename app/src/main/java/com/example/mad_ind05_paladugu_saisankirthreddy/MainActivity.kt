package com.example.mad_ind05_paladugu_saisankirthreddy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mad_ind05_paladugu_saisankirthreddy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        val adapter = MyAdapter(StateDataModel.teamList)
        binding?.rvStateName?.adapter = adapter
        binding?.rvStateName?.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}
