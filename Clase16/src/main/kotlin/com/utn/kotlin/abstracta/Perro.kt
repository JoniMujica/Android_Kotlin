package com.utn.kotlin.abstracta

class Perro(nombre:String, edad:Int, estaVivo:Boolean, val raza:String, val color:String):Animal(nombre, edad, estaVivo) {
    //La clase hija, está obligada a implementar los miembros abstractos de la clase padre

    override var identidad = "Soy un perro"

    override fun andar() = println("Estoy corriendo!")
    override fun emitirSonido() = println("guau guau")
}