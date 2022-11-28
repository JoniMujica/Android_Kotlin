package com.utn.kotlin.ejercicio.herencia.cuentas

import com.utn.kotlin.ejercicio.herencia.clientes.Cliente

class CuentaCorriente(numeroDeCuenta:Int, cliente: Cliente, saldo:Float,
                      var giroDescubierto:Float) : Cuenta(numeroDeCuenta, cliente, saldo) {

    fun depositarCheques(cheque:Cheque){
        //debería agregarse validación teniendo en cuenta la fecha
        saldo += cheque.monto
    }

    override fun extraerEfectivo(monto: Float) {
        if(saldo + giroDescubierto >= monto) saldo-=monto
        println("Saldos insuficientes.")
    }

}