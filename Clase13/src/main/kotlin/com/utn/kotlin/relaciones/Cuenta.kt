package com.utn.kotlin.relaciones

class Cuenta(val numero:Int, val moneda:String, private var saldo:Float = 0f) {
    fun depositar(monto:Float){
        if(monto>0) saldo += monto
    }

    fun debitar(monto:Float){
        if (saldo - monto >= 0) saldo -= monto
        else println("No se puede debitar ese monto. Saldo insuficiente.")
    }

    fun obtenerSaldo() = this.saldo


    override fun toString(): String {
        return "Cuenta(numero=$numero, moneda='$moneda', saldo=$saldo)"
    }


}