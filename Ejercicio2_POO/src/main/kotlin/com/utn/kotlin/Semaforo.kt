package com.utn.kotlin

class Semaforo {
    private var Color = "rojo";

    public fun GetColor():String{
        return this.Color
    }
    public fun setColor(Color:String){
        this.Color = Color
    }
}