package com.utn.kotlin.abstracta

class Ave(nombre:String, edad:Int, estaVivo:Boolean, var pico:String,
          override var identidad : String = "Soy un ave"):Animal(nombre, edad, estaVivo) {

    override fun andar() = println("Estoy volando")

    override fun emitirSonido() = println("pío pío")

}