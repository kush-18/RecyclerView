package com.example.recyclerview1

import android.os.Bundle
import android.window.SplashScreen
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerview1.R
import com.example.recyclerview1.RvAdapter
import com.example.recyclerview1.RvModel
import com.example.recyclerview1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var rvAdapter: RvAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        rvAdapter = RvAdapter(Constant.getData(),this)

        binding.rv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
//        binding.rv.layoutManager = GridLayoutManager(this,2)
//        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        binding.rv.adapter = rvAdapter
    }
}