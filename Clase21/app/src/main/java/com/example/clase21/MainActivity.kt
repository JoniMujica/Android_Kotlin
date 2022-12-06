package com.example.clase21

import android.inputmethodservice.InputMethodService
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.clase21.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val etNum1 = findViewById<EditText>(R.id.et_num1)
//        val etNum2 = findViewById<EditText>(R.id.et_num2)
//        val boton = findViewById<Button>(R.id.btn_calcular)
//        val tvResultado = findViewById<TextView>(R.id.tv_resultado)
//
//        boton.setOnClickListener{
//            val num1 = etNum1.text.toString().toInt()
//            val num2 = etNum2.text.toString().toInt()
//            tvResultado.text = "La suma es = ${num1+num2}"
//        }

        val lista = mutableListOf("sumar","restar","multiplicar","dividir")
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,lista)
        binding.spinner.adapter = adaptador


        binding.btnCalcular.setOnClickListener {
            ocultarTeclado()
            mostrarResultado()
//            vaciarTextos()
        }

    }

    fun vaciarTextos(){
        binding.etNum1.setText("")
        binding.etNum2.setText("")
        binding.etNum1.requestFocus()
    }

    fun ocultarTeclado(){
        val imm : InputMethodManager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(binding.etNum1.windowToken,0)
    }

//    fun mostrarResultado(){
//        val resultado = (binding.etNum1.text.toString().toInt() + binding.etNum2.text.toString().toInt()).toString()
//        binding.tvResultado.text = "La suma es = $resultado"
//    }

    fun obtenerEntero(view: TextView):Int{
        return view.text.toString().toInt()
    }

//    fun mostrarResultado(){
//        if (!binding.etNum1.text.isEmpty() && !binding.etNum2.text.isEmpty()) {
//            val resultado =
//                (obtenerEntero(binding.etNum1) + obtenerEntero(binding.etNum2)).toString()
//            binding.tvResultado.text = "La suma es = $resultado"
//        } else  binding.tvResultado.text = "Debe ingresar ambos números"
//    }

//    fun mostrarResultado(){
//        var resultado = ""
//        if (!binding.etNum1.text.isEmpty() && !binding.etNum2.text.isEmpty()) {
//            if(binding.cbSuma.isChecked){
//                resultado = "La suma es = "+(obtenerEntero(binding.etNum1) + obtenerEntero(binding.etNum2)).toString()
//            }
//            if (binding.cbResta.isChecked){
//                resultado += " La resta es = "+(obtenerEntero(binding.etNum1) - obtenerEntero(binding.etNum2)).toString()
//            }
//            binding.tvResultado.text = resultado
//        } else  binding.tvResultado.text = "Debe ingresar ambos números"
//    }

    fun mostrarResultado(){
        if (!binding.etNum1.text.isEmpty() && !binding.etNum2.text.isEmpty()) {
            when(binding.spinner.selectedItem){
                "sumar" -> binding.tvResultado.text = "La suma es = "+(obtenerEntero(binding.etNum1) + obtenerEntero(binding.etNum2)).toString()
                "restar" -> binding.tvResultado.text = "La resta es = "+(obtenerEntero(binding.etNum1) - obtenerEntero(binding.etNum2)).toString()
                "multiplicar" -> binding.tvResultado.text = "La multiplicación es = "+(obtenerEntero(binding.etNum1) * obtenerEntero(binding.etNum2)).toString()
                "dividir" -> binding.tvResultado.text = dividirPorCero(binding.etNum1.text.toString().toInt(),binding.etNum2.text.toString().toInt())
            }

        } else  binding.tvResultado.text = "Debe ingresar ambos números"
    }

    fun dividirPorCero(num1:Int, num2:Int):String{
        var resultado = ""
        if (num2 != 0) resultado = "La división es = ${num1/num2}"
        else resultado = "No se puede dividir por 0"
        return resultado
    }


}