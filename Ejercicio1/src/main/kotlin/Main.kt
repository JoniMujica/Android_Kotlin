fun main() {
    println("===============Indique cantidad de notas===============")
    var materias : FloatArray = FloatArray(inputInt());
    IngresarNotas(materias)
    Mostrar(materias);3
}
fun Mostrar(notas:FloatArray):Unit{
    if (Promedio(notas) >= 6 && !menorIgual3(notas)){
        println("APROBADO")
    }else if (menorIgual3(notas) && Promedio(notas) < 6){
        println("NO APROBADO")
    }else if(Promedio(notas) < 6 && !menorIgual3(notas)){
        println("Recuperatorio")
    }
}
fun inputInt():Int{
    var numero:Int?;
    do {
        println("Ingrese un valor: ")
        numero = readln().toIntOrNull()
        if (numero == null) println("ERROR: digite un numero entero")
    }while (numero == null)
    return numero;
}
fun inputFloat():Float{
    var numero:Float?;
    do {
        println("Ingrese un valor: ")
        numero = readln().toFloatOrNull()
        if (numero == null) println("ERROR: digite un numero decimal")
    }while (numero == null)
    return numero;
}

fun IngresarNotas(notas: FloatArray){
    println("===============Cargar Notas===============")
    for (i in notas.indices){
        notas[i] = inputFloat()
    }
}

fun Promedio(notas:FloatArray):Float{
    var notasT:Float = 0.0f;
    for (i in notas.indices){
        notasT+=notas[i];
    }
    return notasT/notas.size;
}

/**
 * Indica si tiene alumnos con nota menor a 3 segun el tipo de restriccion
 *
 * @param materias de materias
 * @return devuelve si alguno es menor a 3
 */
fun menorIgual3(materias:FloatArray):Boolean {
    for (i in materias.indices) {
            if (materias[i] <= 3) {
                return true;
            }
    }
    return false;
}