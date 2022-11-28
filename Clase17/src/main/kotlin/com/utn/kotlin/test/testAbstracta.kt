package com.utn.kotlin.test

import com.utn.kotlin.abstracta.*

fun main() {
    /*
    Clases abstractas.
    Son clases que no se pueden instanciar, es decir que no se pueden crear objetos de ella.
    Sirven para generar un molde a otras clases hijas, las clases hijas sí pueden instanciar.
    Los miembros de las clases abstractas también pueden ser abstractos.
    En ese caso significa que no tienen implementación.
    Las propiedades abstractas no tienen estado.
    Y los métodos abstractos no tienen comportamiento.
     */

    //no se pueden crear objetos de una clase abstracta
//    val animal1 = Animal("Pepe",12,true)

    println("\nPerro")
    val perro1 = Perro("Firulais",7,false,"Labrador", "violeta")
    println(perro1.presentacion)
    println(perro1.identidad)
    perro1.andar()
    perro1.emitirSonido()
    perro1.dormir()

    println("\nPez")
    val pez1 = Pez("Nemo", 2,true, "dulce")
    println(pez1.presentacion)
    println(pez1.identidad)
    pez1.andar()
    pez1.emitirSonido()
    pez1.dormir()

    println("\nAve")
    val ave1 = Ave("Piolín", 20, true, "curvo")
    println(ave1.presentacion)
    println(ave1.identidad)
    ave1.andar()
    ave1.emitirSonido()
    ave1.dormir()

//    println("\nPersona")
//    val persona1 = Persona("Nicolás", "Carrizo", 41,"28356356",true)
//    println(persona1.presentacion)
//    println(persona1.identidad)
//    persona1.andar()
//    persona1.emitirSonido()
//    persona1.dormir()
    //al volver abstracta a la clase Persona, no podemos crear objetos de esa clase.

    println("\nEmpleado")
    val empleado1 = Empleado("Hugo","González",26,"2356895",1235,124000f,true)
    println(empleado1.presentacion)
    println(empleado1.identidad)
    empleado1.andar()
    empleado1.emitirSonido()
    empleado1.dormir()
}