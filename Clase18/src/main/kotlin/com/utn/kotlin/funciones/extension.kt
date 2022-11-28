package com.utn.kotlin.funciones

/*
* Funciones de extension:
* Nos permite extender una clase ya existente con una nueva funcionalidad, pero sin necesidad de heredar de esa clase
* Se declaran fuera de la clase que se quiere extender.
* Por lo tanto son tambien funciones de nivel superior.
*
* */

//Example

//Para poder crear una funcion de extension debemos llamar a la clase primero, luego un punto y el identificador de nuestra funcion
//En este caso vamos a extender de la clase String para crear una funcion nos devuelva la cadena con la primera letra en mayuscula

fun String.primeraLetraMayuscula():String{
    return this.substring(0,1).uppercase() + this.substring(1)
}