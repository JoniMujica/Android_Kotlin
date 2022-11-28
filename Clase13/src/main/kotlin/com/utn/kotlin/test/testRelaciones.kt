package com.utn.kotlin.test

import com.utn.kotlin.relaciones.ClienteMayorista
import com.utn.kotlin.relaciones.ClienteMinorista
import com.utn.kotlin.relaciones.Cuenta

fun main() {
    val cuenta1 = Cuenta(1,"pesos")

    println(cuenta1)

    val cuenta2 = Cuenta(2,"dólares")
    val cuenta3 = Cuenta(3,"reales")

    cuenta1.depositar(1000f)
    println(cuenta1.obtenerSaldo())
    cuenta2.depositar(12000f)
    println(cuenta2.obtenerSaldo())
    cuenta2.debitar(1000f)
    println(cuenta2.obtenerSaldo())
    cuenta2.debitar(1000000f)
    println(cuenta2.obtenerSaldo())

    println("\nCliente Minorista")
    val clienteMinorista1 = ClienteMinorista(1,"Monica","Fernandez",4,"Pesos")
    println(clienteMinorista1)

    println("\nCliente Mayorista")
    val clienteMayorista1 = ClienteMayorista(1,"Luna","Larrea 122")
    println(clienteMayorista1)

    clienteMayorista1.agregarCuenta(cuenta1)
    println(clienteMayorista1)
    clienteMayorista1.agregarCuenta(cuenta2)
    clienteMayorista1.agregarCuenta(cuenta3)
    println(clienteMayorista1)
    clienteMayorista1.agregarCuenta(Cuenta(4,"Libras Esterlinas"))
    println(clienteMayorista1)

    clienteMayorista1.borrarCuenta(cuenta3)
    println(clienteMayorista1)

    //Obtengo una cuenta en particular
    println(clienteMayorista1.obtenerUnaCuenta(0))
    //deposito dinero en una cuenta del cliente:
    clienteMayorista1.obtenerUnaCuenta(0).depositar(5000f)
    clienteMayorista1.obtenerUnaCuenta(0).debitar(15000f)



}