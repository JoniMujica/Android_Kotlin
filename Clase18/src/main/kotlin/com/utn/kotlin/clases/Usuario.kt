package com.utn.kotlin.clases

//Las Data Class nos permiten crear clases destinadas específicamente a almacenar datos.
data class Usuario(var id:Int, var nombre:String, var apellido:String){

    //permite crear constructores secundarios
    constructor(id:Int, nombre:String, apellido:String, edad:Int):this(id, nombre, apellido){
        var edad=edad
    }
}

/*
Las "clases de datos" o Data Class, deben llevar definida la palabra Data antes de class.
El constructor principal debe tener al menos un parámetro.
Todos los parámetros del constructor deben marcarse como val o var.
Las Data class no pueden ser abstractas, abiertas, selladas o internas.
En las clases de datos tomando como base las propiedades del constructor primario,
se autogeneran los siguientes métodos:
- equals()
- hashCode()
- copy()
- toString()
- componentN() -> corresponde a cada propiedad en el orden de la declaración.
 */
