package com.utn.kotlin.relaciones

class EmpleadoComposicion(val id:Int, var nombre:String, var apellido:String, var auto:Auto) {
    /*
    Relaciones de composición
    Son aún una relación más fuerte entre clases.
    Una clase no tiene sentido sin la instancia del objeto de la otra clase que lo compone.
    La reconocemos como "siempre tiene".
    Por ejemplo en este caso, un empleado siempre tiene auto.
     */

    //en este caso el método sirve para cambiar el auto
    fun asignarAuto(auto:Auto){
        this.auto = auto
    }

    //con este método mantenemos un tipo de relación muy fuerte entre clases.
    //hay una alta dependencia de clases
    //nos aseguramos de que el auto sólo sea de este empleado
    fun asignarAutoNuevo(marca:String, modelo:String, color:String){
        this.auto = Auto(marca, modelo, color)
    }

    override fun toString(): String {
        return "EmpleadoComposicion(id=$id, nombre='$nombre', apellido='$apellido', auto=$auto)"
    }


}