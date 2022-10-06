package com.utn.kotlin
/*
    gettes y settes
    en kotlin los gettes y setters vienen implicitos con el lenguaje.
    Para acceder a ellos lo hacemos con la notacion de punto (miASuto.marca)
    Se pueden definir getter y setters personalizados. Esto quiere decir que podemos ejecutar codigo al momento de leer o modificar una propiedad
    Esto es lo que se conoce como propiedad computada
    El codigo definido en el getter o en el setter se va a ejecutar cada vez que accedemos al valor de una propiedad (getter)
    o al modificarla (setter)

 */


//Este contructor asi como esta, no esta definiendo las propiedades de Moto (por que no tiene var en los parametros) solo se pasan valores
class Moto (marca:String,modelo:String,color:String){
    var marca = marca
        get() = field.uppercase()
        set(valor:String){
            field = "$valor (Se cambio la marca)"
        }
    var modelo = modelo;
    var color = color;


    //Metodos
    fun acelerar() = println("Estoy acelerando")
    fun frenar() = println("Estoy frenando")

    //sobrecarga de metodos
    fun acelerar(kms:Int) = println("Estoy acelerando $kms kilometros por hora.")
    fun acelerar(kms:Int,turbo:Boolean){
        if (turbo) println("Estoy acelerano ${kms * 2} kilometros por hora")
        else println("Estoy acelerando $kms kilometros por hora")
    }
}