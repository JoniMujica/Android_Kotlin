package com.utn.kotlin.test

import com.utn.kotlin.clases.Enumerado
import com.utn.kotlin.clases.Usuario

fun main() {
    val usuario1 = Usuario(1,"Roberto","Muñoz")

    //getters y setters
    println(usuario1.id)
    println(usuario1.nombre)
    println(usuario1.apellido)
    usuario1.nombre = "Norberto"
    usuario1.apellido = "Paz"
    println(usuario1.nombre)
    println(usuario1.apellido)

    //toString()
    println(usuario1)

    //equals()
    val usuario2 = Usuario(2,"Osvaldo","Pardo")
    //compara el contenido de los objetos. Los considera iguales si los valores de sus propiedades son iguales
    println(usuario1.equals(usuario2))


    //HashCode()
    println(usuario1.hashCode())
    println(usuario2.hashCode())

    usuario2.id=1
    usuario2.nombre="Norberto"
    usuario2.apellido="Paz"

    println(usuario1.hashCode())
    println(usuario2.hashCode())
    println(usuario1.equals(usuario2))

    //copy()
    //este método nos permite clonar un objeto
    val usuario3 = Usuario(3,"Lucas","Mendez")
    val usuario4 = usuario3.copy()
    println(usuario4)
    //con el copy() podemos modificar el valor de las propiedades modificando el argumento nombrado
    val usuario5 = usuario3.copy(nombre="Lucía")
    println(usuario5)

    //componentN()
    //con este método trabajamos sobre la desestructuración tratando a las propiedades del objeto como valores individuales
    val nombre1 = usuario3.component2()
    val apellido1 = usuario1.component3()
    println(nombre1)
    println(apellido1)


    println("\nEnumerados")
    var dia = Enumerado.DOMINGO
    println(dia)
    when(dia){
        Enumerado.LUNES,Enumerado.MARTES,Enumerado.MIERCOLES,Enumerado.JUEVES,Enumerado.VIERNES
            -> println("Día de semana")
        Enumerado.SABADO,Enumerado.DOMINGO -> println("Fin de semana")
    }

    //.values() nos devuelve un listado con todos los elementos del enumerado
    for (i in Enumerado.values()) println(i)

    //Clase Pair
    //es una clase que se utiliza para almacenar o devolver dos valores de tipos de datos iguales o diferentes
    //puede haber o no relación entre ellos
    //ejemplo de Pair
    Pair("Hola","Cómo estás?")
    Pair("Juan",30)
    Pair(2.4f,true)

    var variable1 = "Manzana"
    var variable2 = 77

    var variable3 = Pair(variable1,variable2)
    println(variable3)

    var fruta = variable3.first
    var numero = variable3.second

    println(fruta)
    println(numero)

    //lo mismo podemos hacer con Triple para almacenar 3 tipos de datos
    var variable4 = Triple(1,true,"hola")
    println(variable4.first)
    println(variable4.second)
    println(variable4.third)





}
