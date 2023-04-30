package com.example.mon6hom3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.mon6hom3.ViewModel.CounterViewModel
import com.example.mon6hom3.databinding.ActivityMainBinding
import com.example.mon6hom3.fragments.adapter.PagerAdapter


class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager
    private lateinit var pagerAdapter: PagerAdapter
    private lateinit var counterViewModel: CounterViewModel

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialization()
    }

    private fun initialization() {
        pagerAdapter = PagerAdapter(this)
        binding.vpMvvm.adapter = pagerAdapter


    }
}