package com.utn.kotlin

/*
Constructor:
- Es el primer método que se ejecuta
- Se ejecuta en forma automática
- No puede retornar datos
- Se ejecuta una única vez
- Un constructor tiene como objetivo inicializar los atributos
- Una clase puede tener varios constructores, pero sólo uno principal
- Si no especificamos un constructor, el compilador de Kotlin generará uno vacío (sin parámetros) por defecto
- Los constructores pueden ser primarios o secundarios
- El constructor primario es el que se declara en la cabecera de la clase
 */

class Auto(private var marca:String, private var modelo:String, private var color:String) {
    var marcaModeloColor = "El auto es de marca $marca, su modelo es $modelo y es de color $color."
    var usuario = ""

    //constructores secundarios
    //para crear constructores secundarios debemos anteponer la palabra constructor
    constructor(marca:String, modelo:String, color:String, usuario:String) :this (marca, modelo, color){
        this.usuario = usuario
        if (usuario.lowercase() == "carlos") println("Debe presentar documentación.")
    }
}