package com.utn.kotlin.herencia

import com.utn.kotlin.relaciones.Cuenta

class Cliente(nombre:String,apellido:String,edad:Int,domicilio:String,var sexo:Char,var telefono:String,var cuenta: Cuenta):Persona(nombre,apellido,edad,domicilio) {
    //al sobreescribir el metodo toString() concatenamos el toString() de la clase padre
    override fun toString(): String {
        return super.toString() + "Cliente(sexo=$sexo, telefono='$telefono', cuenta=$cuenta)"
    }
    override fun saludar() = "Hola, soy un cliente";
}