package com.utn.kotlin.relaciones

class ClienteMayorista(val id:Int, private val razonSocial:String, private var direccion:String,
                        private val cuentas : MutableList<Cuenta> = mutableListOf<Cuenta>()) {

    fun agregarCuenta(cuenta:Cuenta){
        cuentas.add(cuenta) //el método .add() de List permite agregar elementos a la lista
    }

    fun borrarCuenta(cuenta:Cuenta){
        cuentas.remove(cuenta) //el método remove() elimina elementos de la lista
    }

    fun obtenerCuentas(){
        cuentas.forEach(){
            println(it.obtenerSaldo())
        }
    }

    fun obtenerUnaCuenta(numero:Int) = cuentas[numero]

    override fun toString(): String {
        return "ClienteMayorista(id=$id, razonSocial='$razonSocial', direccion='$direccion', cuentas=$cuentas)"
    }


}