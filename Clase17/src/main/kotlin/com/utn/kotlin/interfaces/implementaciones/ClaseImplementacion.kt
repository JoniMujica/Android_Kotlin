package com.utn.kotlin.interfaces.implementaciones

import com.utn.kotlin.interfaces.I_EjemploInterface

class ClaseImplementacion : I_EjemploInterface{
    //la clase tiene que implementar los miembros abstractos de la interfaz

    override val propiedad1 = "Primera propiedad"

    override fun metodo1() = "Implementación del primer método"

    override val propiedad2 = "Propiedad2 sobrescrita"

    override fun metodo2() = "Método2 sobrescrito"
}