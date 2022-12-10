package com.example.clase23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clase23.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCambiar.setOnClickListener {
            irOtraActividad()
        }
        binding.btncontar.setOnClickListener { contar() }
    }

    private fun irOtraActividad() {
        var intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
    private fun contar(){
        contador++
        binding.tvContador.text = "Usted presiono el boton $contador veces"
    }
}