package com.utn.kotlin.herencia

class Empleado(nombre:String,apellido:String,edad:Int,domicio:String,var legajo:Int,var sueldoBasico:Float) : Persona(nombre,apellido,edad,domicio) {
    override fun toString(): String {
        return super.toString() + "Empleado(legajo=$legajo, sueldoBasico=$sueldoBasico)" //super hace llamado al objeto padre
    }
    //para poder modificar el comportamiento de un metodo, lo tenemos que sobreescribir
    //se sobreescribe con la palabra reservada override

    override fun saludar() = "Hola, soy un empleado";
}