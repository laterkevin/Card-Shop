package com.example.cardshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.cardshop.cardadapter.NewsAdapter
import com.example.cardshop.cardadapter.PopularAdapter
import com.example.cardshop.data.Datasource
import com.example.cardshop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val popular = Datasource().loadPopular()

        binding.popularRecycler.adapter = PopularAdapter(this, popular)

        binding.popularRecycler.setHasFixedSize(true)

        val news = Datasource().loadNews()

        binding.newsRecycler.adapter = NewsAdapter(this, news)

        binding.newsRecycler.setHasFixedSize(true)

    }
}
