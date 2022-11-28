package com.utn.kotlin.test

import com.utn.kotlin.funciones.primeraLetraMayuscula
import com.utn.kotlin.funciones.sumaSuperior


fun main() {

    //funciones que devuelven un par de resultados
    fun SumarYRestar(num1:Int, num2:Int): Pair<Int, Int>{
        var suma = num1 + num2
        var resta = num1 - num2
        return Pair(suma, resta)
    }

    println("La suma de 10 y 2 es ${SumarYRestar(10,2).first}")
    println("La resta de 10 y 2 es ${SumarYRestar(10,2).second}")

    //funciones que devuelven tres resultados
    fun SumarRestarYMultiplicar(num1:Int, num2:Int) : Triple<Int, Int, Int>{
        var suma = num1 + num2
        var resta = num1 - num2
        var multiplicacion = num1 * num2
        return Triple(suma, resta, multiplicacion)
    }
    println("La multiplicación de 10 y 2 es ${SumarRestarYMultiplicar(10,2).third}")

    var numero1 = 10
    var numero2 = 2
    var suma = sumaSuperior(numero1,numero2)
    println(suma)
    //utilizamos una funcion extendida

    var saludo = "hola";
    println(saludo.primeraLetraMayuscula())

    /*
    * Funciones anonimas
    * Son literales de funcion.Permiten tratarlas como valores con el fin de representar tipos de funcion.
    * Permites pasar bloques de codigo a otras funciones con capacidad de retornar un resultado
    * No se les define nombre
    * No pueden ser genericas
    * No puedem tener argumentos por defectos
    * Se puede omitir el tipo de dato para los parametros y retorno si es posible inferirlos por el contexto
    * El return representa el retorno de esta nisma funcion y no el de la que la cubre
    * */

    //fun saludar ()= println("hola")
    //saludar()

    //creamos una funcion anonima
    //fun()= println("hola")

    val miFuncion = fun() = println("hola")
    miFuncion()

    //contamos cuantas veces aparece el numero 5 en una lista de elementos
    val numeros = listOf(2,3,4,5,6,7,5,8,9);

    val miFuncion2 = fun(numero:Int):Boolean{
        return numero == 5
    }
    //val resultado = numeros.count(fun(numero)=numero == 5)
    //println(resultado);

    /*
    * Lambdas
    * Una funcion lambda es una literal de funcion que puede ser usada como expresion.
    * No tiene identificador y se puede usar como un valor
    * No esta vinculadas a ninguna entidad como clase, interfaz, objeto.
    * Se pueden pasar como argumentos a otras funciones
    * Una expresion lambda representa solo el bloque de una funcion
    *
    * CARACTERISTICAS:
    * Debe estar rodeadas de llaves
    * No llevan la palabra clave "fun"
    * No hay modificador de acceso por que no perteneces a ninguna entidad
    * Es una funcion anonima por que no tiene un nombre que la identifique
    * No especifica ninigun tipo de retorno, el compilador lo infiere
    * Los parametros no estan entre parentesis
    * podemos asignar una expresion lambda a una variable y luego ejecutarla
    *
    * ESTRUCTURA:
    * Lista de parametros: Cada parametro es la declaracion de una variable
    * Operador flecha -> : Se omite si no hay parametros
    * Cuerpo de la expresion: Conjunto de sentencias que se ejecutan luego del operador flecha
    * Va encerrado entre llaves
    * {parametros -> cuerpo }
    * */

    //Example

    //funcion clasica
    //fun sumaroDos(x:Int) = x+2;

    //como lambda
    { x:Int -> x+2 }

    //val resultado = numeros.count({num:Int -> num==5})
    //println("El numero 5 aparece $resultado veces");

    //Si la expresion lambd a es el ultimo argumento en la fguncion,podemos escribirla por fuera del parentesis
    //val resultado = numeros.count() {num:Int -> num==5}
    //println("El numero 5 aparece $resultado veces");

    //si los parentesis estan vacios,los podemos omitir
    //val resultado = numeros.count {num:Int -> num==5}
    //println("El numero 5 aparece $resultado veces");

}