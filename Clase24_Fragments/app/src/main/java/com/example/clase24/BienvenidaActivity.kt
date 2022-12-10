package com.example.clase24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clase24.databinding.ActivityBienvenidaBinding

class BienvenidaActivity : AppCompatActivity() {
    private lateinit var binding : ActivityBienvenidaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBienvenidaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val usuario = intent.getStringExtra(KEY_MESSAGE)
        binding.tvBienvenida.setText("Bienvenido usuario/a $usuario")
    }
    companion object{
        const val KEY_MESSAGE = "com.example.clase24.fragment.mensaje1"
    }

}