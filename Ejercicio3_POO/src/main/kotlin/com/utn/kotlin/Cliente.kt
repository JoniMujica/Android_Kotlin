package com.utn.kotlin

class Cliente(private var nombre:String,private var apellido:String,private var cuenta:Int,private var saldo:Double=0.0) {

    public fun Deposito(saldo:Double){
        this.saldo+=saldo
        println("Se recargo $${saldo}, tu nuevo saldo es ${this.saldo}")
    }
    public fun Extraccion(saldo:Double){
        if (this.saldo-saldo < 0){
            println("ERROR: no tienes saldo suficiente para esta extraccion, saldo maximo $${this.saldo}")
        }else{
            this.saldo-=saldo
            println("Se retiro $${saldo}, tu nuevo saldo es ${this.saldo}")
        }
    }


    //EXTRAS
    public fun GetSaldo():Double{
        return this.saldo;
    }
    public fun GetNombre():String{
        return this.nombre;
    }
    public fun GetApellido():String{
        return this.apellido;
    }
    public fun GetCuenta():Int{
        return this.cuenta;
    }
}