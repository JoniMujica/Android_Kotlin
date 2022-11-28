package com.utn.kotlin.relaciones

class EmpleadoAsocSimple(val legajo:Int, var nombre:String, var apellido:String) {
    /*
    Relación de asociación simple
    Es la relación menos acoplada.
    La reconocemos como "usa un/a".
    En este caso, un empleado usa un auto
     */

    fun usarAuto(auto:Auto){
        println("El empleado $nombre, está usando el auto $auto")
    }

    override fun toString(): String {
        return "EmpleadoAsocSimple(legajo=$legajo, nombre='$nombre', apellido='$apellido')"
    }


}