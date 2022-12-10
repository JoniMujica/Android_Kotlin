package com.example.clase23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clase23.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCambiar.setOnClickListener {
            irOtraActividad()
        }
    }

    private fun irOtraActividad() {
        var intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}