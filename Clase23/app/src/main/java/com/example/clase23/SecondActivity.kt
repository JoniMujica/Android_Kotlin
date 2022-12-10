package com.example.clase23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clase23.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val mensaje = intent.getStringExtra(KEY_MESSAGE)
        binding.txtBienvenido.text = "El numero que llego del MainActiviti es $mensaje"

    }

    companion object{
        const val KEY_MESSAGE = "com.example.clase23.mensaje1"
    }
}