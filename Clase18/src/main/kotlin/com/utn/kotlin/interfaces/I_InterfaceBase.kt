package com.utn.kotlin.interfaces


/*
Problema de diamantes. Ocurre cuando dos objetos secundarios de un objeto base, describen un comportamiento particular
definido por el objeto base.
Ahora, un objeto que hereda de estos dos objetos secundarios tiene que resolver a qué comportamiento heredado se suscribe.
 */

interface I_InterfaceBase {

    fun primerMetodo() : String

}