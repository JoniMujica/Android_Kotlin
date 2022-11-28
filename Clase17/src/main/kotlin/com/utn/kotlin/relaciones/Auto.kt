package com.utn.kotlin.relaciones

class Auto(val marca:String, val modelo:String, val color:String) {
    private var velocidad:Int = 0

    fun acelerar() {
        velocidad +=10
    }

    fun frenar(){
        velocidad -= 10
    }

    override fun toString(): String {
        return "$marca modelo $modelo de color $color. Tiene una velocidad actual de $velocidad Kms. por hora."
    }


}