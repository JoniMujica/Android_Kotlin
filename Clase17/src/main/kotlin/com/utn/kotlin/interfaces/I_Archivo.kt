package com.utn.kotlin.interfaces

interface I_Archivo {
    val tipoArchivo : String

    fun setText(texto:String)
    fun getText() : String
    fun info() = println("Interface I_Archivo")
}