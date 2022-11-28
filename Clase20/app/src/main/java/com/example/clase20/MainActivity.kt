package com.example.clase20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val hellotext = findViewById<TextView>(R.id.tv_saludo) //guardo en una variable la vista tv_saludo para cambiar sus propiedades
        //hellotext.text = "Hola Mundo!" //cambio los valores de los textos de la vista explicita

       // hellotext.setText("Hola Android!") //cambio los valores de los textos de la vista por setter

        Log.d(tag,"OnCreate")
        /////////////// aca referencio a los inputs de view para hacer la suma y mostrarlos
        val et1 = findViewById<EditText>(R.id.et_primero)
        val et2 = findViewById<EditText>(R.id.et_segundo)
        val boton = findViewById<Button>(R.id.btn_sumar)
        val resultado = findViewById<TextView>(R.id.tv_resultado)
        boton.setOnClickListener {
            val nr1 = et1.text.toString().toInt()
            val nr2 = et2.text.toString().toInt()
            val suma = nr1 + nr2
            resultado.text = "El resultado de la suma es de ${suma.toString()}"
        }
        ////////////////////////////////////////////////
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag,"OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag,"OnResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag,"OnRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag,"OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag,"OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag,"OnDestroy")
    }


}