package com.example.tablayouttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.tablayouttask.adapter.FragmentAdapter
import com.example.tablayouttask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        val myAdapter= FragmentAdapter(supportFragmentManager)
        binding.mainActivity.adapter=myAdapter

        binding.tabLayout.setupWithViewPager(binding.mainActivity)
    }

}