package com.example.clase22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.clase22.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
    //binding.btnBoton1.visibility = View.INVISIBLE
    fun mostrarBtn1(view:View){
        binding.btnBoton1.visibility = View.VISIBLE
    }
    fun ocultarBtn4(view:View){
        binding.btnBoton4.visibility = View.INVISIBLE
    }
    fun ocultarBtn2(view:View){
        binding.btnBoton2.visibility = View.GONE
    }
}