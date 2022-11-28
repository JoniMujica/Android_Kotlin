package include

fun inputInt():Int{
    var numero:Int?;
    do {
        println("Ingrese el numero de tipo de operacion: ")
        numero = readln().toIntOrNull()
        if (numero == null) println("ERROR: digite un numero entero")
    }while (numero == null)
    return numero;
}

fun inputDouble():Double{
    var numero:Double?;
    do {
        println("Ingrese el Saldo: ")
        numero = readln().toDoubleOrNull()
        if (numero == null || numero < 0) println("ERROR: digite un numero decimal mayo a cero")
    }while (numero == null || numero < 0)
    return numero;
}
fun ExisteItem(item:Int):Boolean{
    if (item < 0 || item > 2){
        println("Error, producto invalido")
        return false;
    }
    return true;
}