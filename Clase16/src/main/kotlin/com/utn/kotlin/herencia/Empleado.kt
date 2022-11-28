package com.utn.kotlin.herencia

class Empleado(nombre:String, apellido:String, edad:Int, domicilio:String,
               var legajo:Int, var sueldoBasico:Float) : Persona(nombre, apellido, edad, domicilio) {

    //al sobreescribir el método toString() concatenamos el toString() de la clase padre (super)
    override fun toString(): String {
        //con el super hacemos referencia a la clase padre
        return super.toString() + "Empleado(legajo=$legajo, sueldoBasico=$sueldoBasico)"
    }

    //para poder modificar el comportamiento de un método, lo tenemos que sobrescribir
    //se sobrescribe con la palabra reservada override

    override fun saludar() = "Hola, soy un empleado! "



}