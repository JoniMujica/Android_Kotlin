package com.example.clase21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.clase21.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding //lateinit para inicializar despues
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        /*val et_num1 = findViewById<EditText>(R.id.et_num1)
        val et_num2 = findViewById<EditText>(R.id.et_num2)
        val boton = findViewById<Button>(R.id.btn_calcular)
        val tvResultado = findViewById<TextView>(R.id.tv_resultado)

        boton.setOnClickListener {
            val num1 = et_num1.text.toString().toInt()
            val num2 = et_num2.text.toString().toInt()
            tvResultado.text = "La suma es = ${num1 + num2}" */
        binding.btnCalcular.setOnClickListener {
            val num1 = binding.etNum1.text.toString().toInt()
            val num2 = binding.etNum2.text.toString().toInt()
            binding.tvResultado.text = "La suma es = ${num1+num2}"
        }

    }
}