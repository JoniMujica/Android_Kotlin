package com.utn.kotlin.test

import com.utn.kotlin.herencia.Cliente
import com.utn.kotlin.herencia.Ejemplo
import com.utn.kotlin.herencia.Empleado
import com.utn.kotlin.herencia.Persona
import com.utn.kotlin.relaciones.Cuenta

/*
HERENCIA
La herencia es un mecanismo de la POO, para diseñar 2 o mas entidades que son diferentes pero que comparten caracteristicas en comun
Sirve para reutilizar miembros de una clase
Es el caso de la relacion mas fuente entre clases
La reconocemos como "es un/a".
El proceso consiste en definir una clase como clase padre o super clase que contenga todas las caracteristicas en comun.
Luego de eso se definen la o las clases hijas derivadas o subclases que heredas esas caracterristicas.
En este caso cuando hablamos de caracteristicas nos referimos tanto a propiedades como metodos.
Una clases en Kotlin solo puede tener una herencia directa.
Kotlin no soporta la herencia multiple.

 */
fun main() {
    /*
    Em Kotlin la clase Any es la raiz de las jerarquias de clases. Cada clase deriva de ella si mo especificamos una

    La clase Ant tiene 3 metodos que se heredan:
    -equals(): Indica si otro objeto es igual al actual.
    -hashcode(): Retorna el codigo hash asociado al objeto
    -toString: retorna la representacion String del objeto
     */

    val objeto1 = Ejemplo()
    val objeto2 = Ejemplo()
    println(objeto1.toString())
    println(objeto2.toString())
    println(objeto1.hashCode())
    println(objeto2.hashCode())
    println(objeto1.equals(objeto1))

    var persona1 = Persona("Marcelo","Correa",42,"balboa 2345");
    println(persona1)

    //testeamos la clase de Empleado
    println("\nEmpleado")
    val empleado1 = Empleado("Martin","Lopez",26,"Zarratea 20",123,35000f)
    println(empleado1)
    println(empleado1.saludar())

    //testeamos la clase de Cliente
    println("\nCliente")
    val cuenta1 = Cuenta(1,"Pesos argentinos")
    val cliente1 = Cliente("Juan","Gonzalez",56,"Uruguay 201",'m',"44445-454",cuenta1)
    println(cliente1)
    println(cliente1.saludar())

}