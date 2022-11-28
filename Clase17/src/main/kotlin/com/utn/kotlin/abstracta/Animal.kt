package com.utn.kotlin.abstracta

//Las clases abstractas son abiertas por defecto por lo cual no se agrega el open (sería redundante).
//deben llevar el modificador abstract
abstract class Animal(var nombre:String, var edad:Int, var estaVivo:Boolean) {
    /*
    Las clases abstractas no se pueden instanciar.
    Sirven para generar un molde para sus clases hijas.
     */
    var presentacion = "Hola! soy un ser vivo!"
    abstract var identidad : String

    abstract fun andar()
    abstract fun emitirSonido()
    fun dormir() = println("Estoy durmiendo...")

    /*
    Miembros abstractos de una clase abstracta:
    las propiedades no tienen estados y los métodos no tienen cuerpo (comportamiento).
    Las clases hijas están obligadas a implementar los miembros abstractos de la clase.
    Es decir, darle un estado a las propiedades y darle comportamiento a los métodos.
     */

    //los métodos que no sean abstractos y se quieran modificar deben llevar el open

}