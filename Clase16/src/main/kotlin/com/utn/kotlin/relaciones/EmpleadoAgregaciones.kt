package com.utn.kotlin.relaciones

class EmpleadoAgregaciones(val legajo:Int, var nombre:String, var apellido:String) {
    /*
    Relación de agregación.
    Son una relación más fuerte entre clases.
    Son de las más utilizadas.
    Las reconocemos como "tiene un/a".
    Por ejemplo en este caso, un empleado tiene un auto
     */

    //modificador lateinit indica que la inicialización de la propiedad se hará luego
    private lateinit var auto : Auto

    //asigna y/o modifica el auto que tiene el empleado.
    fun asignarAuto(auto:Auto){
        this.auto=auto
    }

    fun obtenerAuto() {
        if(::auto.isInitialized) println("El empleado está utilizando el auto $auto")
        else println("El empleado aún no tiene auto")
    }

    override fun toString(): String {
        return "EmpleadoAgregaciones(legajo=$legajo, nombre='$nombre', apellido='$apellido')"
    }


}