package com.utn.kotlin.herencia

open class Persona(var nombre:String, var apellido:String, var edad:Int, var domicilio:String) {

    //con la palabra reservada open indico que se puede sobrescribir el método
    open fun saludar() = "Hola, soy una persona!"

    override fun toString(): String {
        return "Persona(nombre='$nombre', apellido='$apellido', edad=$edad, domicilio='$domicilio')"
    }

    /*
    Las clases en Kotlin están "cerradas" de forma predeterminada. Y no se puede heredar de ellas.
    A menos que se declare explícitamente que la clase es abierta o abstracta.
    La subclase debe invocar a uno de sus constructores. Pasando los parámetros de su propio constructor.
     */

}