package includes

import java.util.*

fun ColorValido(color:String):Boolean{
    var lower = color.lowercase()
    if (lower == "rojo" || lower == "amarillo" || lower == "verde" || lower == "0") return true

    return  false
}
fun InputString():String{
    var color:String;
    do {
        println("Ingrese el color de la luz del semaforo: ")
        color = readln()
        if (color == null || !ColorValido(color)) println("ERROR: Ingrese un color valido para el semaforo")
    }while (color == null || !ColorValido(color))

    return color;
}