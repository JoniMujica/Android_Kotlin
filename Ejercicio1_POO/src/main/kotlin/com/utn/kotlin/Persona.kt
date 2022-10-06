package com.utn.kotlin

class Persona(private var nombre:String, private var apellido:String, private var dni:String) {

    public fun Saludar(idioma:String){
        idioma.lowercase()
        println(Pensar(idioma))
    }
    private fun Pensar(idioma:String):String{
        var saludo:String;
        if (idioma == "ingles"){
            saludo = "Hello my fullname is ${this.nombre} ${this.apellido}, and my DNI is ${this.dni}"
        }else if (idioma == "ruso"){
            saludo = "Привет меня зовут ${this.nombre} ${this.apellido}, и моя личность ${this.dni}"
        }else if (idioma == "portugues"){
            saludo = "oi! meu nome é ${this.nombre} ${this.apellido}, e minha identidade é ${this.dni}"
        }else{
            saludo = "Hola, mi nombre es ${this.nombre} ${this.apellido}, y mi numero de DNI es ${this.dni}"
        }
        return saludo;
    }
}