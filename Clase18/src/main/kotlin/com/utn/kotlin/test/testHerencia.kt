package com.utn.kotlin.test

import com.utn.kotlin.herencia.Cliente
import com.utn.kotlin.herencia.Ejemplo
import com.utn.kotlin.herencia.Empleado
import com.utn.kotlin.herencia.Persona
import com.utn.kotlin.relaciones.Cuenta

/*
HERENCIA
La herencia es un mecanismo de la POO, para diseñar dos o más entidades que son diferentes pero que comparten características
en común.
Sirve para reutilizar miembros de una clase.
Es el caso de relación más fuerte entre clases.
La reconocemos como "es un/a".
El proceso consiste en definir una clase como clase padre o super clase que contenga todas las características en común.
Luego se definen la o las clases hijas, derivadas o subclases que heredan esas características.
En este caso cuando hablamos de características nos referimos tanto a propiedades como métodos.
Una clase en Kotlin solo puede tener una herencia directa.
Kotlin no soporta la herencia múltiple.
 */

fun main() {

    /*
    En Kotlin, la clase Any es la raíz de las jerarquías de clases. Cada clase deriva de ella si no especificamos una

    La clase Any tiene 3 métodos que se heredan:
    - equals() : indica si otro objeto es igual al actual.
    - hashcode() : retorna el código hash asociado al objeto.
    - toString() : retorna la representación String del objeto
     */

    val ejemplo1 = Ejemplo()
    val ejemplo2 = Ejemplo()

    println(ejemplo1.toString())
    println(ejemplo2.toString())
    println(ejemplo1.hashCode())
    println(ejemplo2.hashCode())
    println(ejemplo1.equals(ejemplo2))

    //testeamos la clase Persona
    println("\nPersona")
    val persona1 = Persona("Marcelo","Correa",42,"Balboa 2345")
    println(persona1)
    println(persona1.saludar())

    //testeamos la clase Empleado
    println("\nEmpleado")
    val empleado1 = Empleado("Martín","López",26,"Zarratea 20",123,35000f)
    println(empleado1)
    println(empleado1.saludar())

    //testeamos la clase Cliente
    println("\nCliente")
    val cuenta1 = Cuenta(1,"Pesos Argentinos")
    val cliente1 = Cliente("Juan","González",56,"Uruguay 201",'m',"4444-5686",cuenta1)
    println(cliente1)
    println(cliente1.saludar())

    //para poder acceder a los métodos de la clase cuenta, debo primero acceder al objeto de la clase cuenta
    //que en este caso es una propiedad de cliente1
    cliente1.cuenta.depositar(10000f)
    println(cliente1.cuenta.obtenerSaldo())

    //Polimorfismo
    //"muchas formas" traducción etimológica de la palabra.
    //Representa la capacidad de poder enviar mensajes iguales a objetos de distinto tipo.

    println("\nPolimorfismo")
    var personaGral : Persona = Empleado("Mirta","Risso",52,"Landia 234",12,135000f)
    println("persona1 = $personaGral")
    println(personaGral.saludar())
    personaGral = Cliente("Raúl","Mónaco",27,"Florida 234",'m',"234556",Cuenta(2,"Reales"))
    println("persona1 = $personaGral")
    println(personaGral.saludar())
    

}