package com.utn.kotlin.abstracta

class Empleado(nombre:String, apellido:String, edad:Int, dni:String,
               var nroLegajo:Int, var sueldoBasico:Float, estaVivo:Boolean): Persona(nombre, apellido, edad, dni,estaVivo) {

    override var identidad = "Soy un empleado"
}