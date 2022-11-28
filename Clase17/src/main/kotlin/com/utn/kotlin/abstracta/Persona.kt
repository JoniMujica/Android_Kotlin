package com.utn.kotlin.abstracta

abstract class Persona(nombre:String, var apellido:String, edad:Int, val dni:String,
              estaVivo:Boolean) : Animal(nombre, edad, estaVivo) {

    //Las clases hijas de clases abstractas están obligas a implementar todos los miembros abstractos
    //a menos que la clase hija sea abstracta, en cuyo caso, su clase hija tendrá que hacerlo
//    override var identidad = "Soy una persona"

    override fun andar() = println("Estoy caminando")
    override fun emitirSonido() = println("bla bla bla")
}