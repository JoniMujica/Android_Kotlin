package com.utn.kotlin.abstracta

class Pez(nombre:String, edad:Int, estavivo:Boolean, var tipoDeAgua:String) :Animal(nombre, edad, estavivo) {
    override var identidad = "Soy un pez"

    override fun andar() = println("Estoy nadando!")
    override fun emitirSonido() = println("glup glup")
}