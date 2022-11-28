package com.utn.kotlin.ejercicio.herencia.cuentas

import com.utn.kotlin.ejercicio.herencia.clientes.Cliente

abstract class Cuenta(val numeroDeCuenta:Int, val cliente: Cliente, var saldo:Float ) {

    fun depositarEfectivo(monto:Float){
        if(monto>0) saldo += monto
    }

    abstract fun extraerEfectivo(monto:Float)



}