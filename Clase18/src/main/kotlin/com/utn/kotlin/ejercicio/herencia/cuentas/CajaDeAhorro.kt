package com.utn.kotlin.ejercicio.herencia.cuentas

import com.utn.kotlin.ejercicio.herencia.clientes.Cliente

class CajaDeAhorro(numeroDeCuenta:Int, cliente: Cliente, saldo:Float,
                   var tasaDeInteres:Int):Cuenta(numeroDeCuenta,cliente,saldo) {


    override fun extraerEfectivo(monto: Float) {
        if(monto <= saldo) saldo-=monto
        println("Saldos insuficientes.")
    }

    fun cobrarInteres(){
        saldo += saldo * tasaDeInteres / 100
    }

}