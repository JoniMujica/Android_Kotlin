package com.utn.kotlin.relaciones

class ClienteMinorista(val id:Int, var nombre:String, var apellido:String, numero:Int, moneda:String ) {
    val cuenta = Cuenta(numero, moneda)


    override fun toString(): String {
        return "ClienteMinorista(id=$id, nombre='$nombre', apellido='$apellido', cuenta=$cuenta)"
    }


}