package com.example.clase24gatitos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clase24gatitos.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //para saber que cosas se pueden hacer con picasso -> https://square.github.io/picasso
        Picasso.get().load("https://placekitten.com/200/300").into(binding.imgGatitos)
    }
}