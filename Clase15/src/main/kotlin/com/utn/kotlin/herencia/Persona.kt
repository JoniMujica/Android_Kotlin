package com.utn.kotlin.herencia

open class Persona(var nombre:String,var apellido:String,var edad:Int,var domicilio:String) {
    open fun saludar() ="Hola, soy una persona";
    override fun toString(): String {
        return "Persona(nombre='$nombre', apellido='$apellido', edad=$edad, domicilio='$domicilio')"
    }
    /*
    Las clases en Kotlin estan cerradas de forma predeterminada. Y no se puede heredar de ellas.
    A menos que se declare explicitamente que la clase es abierta o abstracta
    La subclase debe invocar a sus constructores. Pasando los parametros de su propio constructor
     */

}