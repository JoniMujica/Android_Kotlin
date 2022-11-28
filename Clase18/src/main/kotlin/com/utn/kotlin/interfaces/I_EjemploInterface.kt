package com.utn.kotlin.interfaces

interface I_EjemploInterface {
    val propiedad1 : String
    val propiedad2 : String
        get() = "segunda propiedad"
//    val propiedad3 : String = "hola"

    fun metodo1() : String

    fun metodo2() = "Segundo método de la interfaz"




}