package com.utn.kotlin.clases

//Para crear una clase enumerada la tenemos que crear como una enum class
//Las clases enum, representan una enumeración de valores que se identifican por su nombre.
//Nos van a ahorrar trabajo de validaciones
//Los nombres se representan como constantes

enum class Enumerado {
    //por ejemplo, creamos un enumerado con los días de la semana
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    //no necesitamos indicarle que son val
    //las escribimos en mayúsculas, una al lado de la otra separadas con coma
}