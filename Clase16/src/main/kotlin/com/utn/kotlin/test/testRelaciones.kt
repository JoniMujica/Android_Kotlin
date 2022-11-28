package com.utn.kotlin.test

import com.utn.kotlin.relaciones.*

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
    println("")
    clienteMayorista1.obtenerCuentas()

    println("")
    val clienteMinorista2 = ClienteMinorista(12,"Marcela","Rosi",11,"Pesos")
    println(clienteMinorista2)

    clienteMinorista2.cuenta.depositar(10000f)
    println(clienteMinorista2.cuenta)

    //creamos un apuntador, es una referencia. No ocupa más espacio de memoria
    val cta = clienteMinorista2.cuenta

    cta.depositar(2000f)
    println(cta)

    //testeamos Clase Auto
    println("")
    val auto1 = Auto("Ford","Falcon","Rojo")
    println(auto1)

    println("\nEmpleadoAsocSimple")
    val empleadoAsocSimple1 = EmpleadoAsocSimple(1,"Belén","Fonseca")
    println(empleadoAsocSimple1)
    empleadoAsocSimple1.usarAuto(auto1)

    println("\nEmpleadoAgregaciones")
    val empleadoAgregaciones1 = EmpleadoAgregaciones(2,"Martín","Perez")
    println(empleadoAgregaciones1)

    empleadoAgregaciones1.obtenerAuto()
    empleadoAgregaciones1.asignarAuto(auto1)
    empleadoAgregaciones1.obtenerAuto()

    println("\nEmpleadoComposicion")
    val empleadoComposicion1 = EmpleadoComposicion(3, "Diego", "Lemas",auto1)
    println(empleadoComposicion1)
    empleadoComposicion1.asignarAutoNuevo("Chevrolet","Corsa","Blanco")
    println(empleadoComposicion1)

    val empleadoComposicion2 = EmpleadoComposicion(34,"Franco","Gonzalez",Auto("Citroen", "3CV","Amarillo"))
    println(empleadoComposicion2)

}