package com.utn.kotlin

class JugadorDeFutbol(private var nombre:String,private var energia:Int = 100,private var felicidad:Int=50,private var goles:Int = 0,private var experiencia:Int=0) {
    private fun hacerGol(){
        this.energia-=5
        this.felicidad+=10
        println("GOOOOOOOOOOOOOOOOOOOL!!")
    }
    private fun Correr(){
        this.energia-=10
        println("No me dan mas las piernas")
    }
    public fun Entrenar(){
        if (this.energia<=0){
            println("El jugador tiene poca energia, no puede entrenar\tEnergia -> ${this.energia}")
        }else{
            var expInicial = this.experiencia
            Correr()
            hacerGol()
            Correr()
            this.experiencia++
            println("Experiencia inicial ${expInicial}, experiencia final ${this.experiencia}")
        }
    }
}