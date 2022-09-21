fun main() {
    println("===============Indique cantidad de notas===============")
    var materias : FloatArray = FloatArray(inputInt());
    IngresarNotas(materias)
    Mostrar(materias);
}

fun IngresarNotas(notas: FloatArray){
    println("===============Cargar Notas===============")
    for (i in notas.indices){
        println("Cargar nota n°${i+1}")
        notas[i] = inputFloat()
    }
}
fun Mostrar(notas:FloatArray){

    println("Promedio Total: ${Promedio(notas)}")
    if (Promedio(notas) >= 6 && !menorIgual3(notas)){
        println("APROBADO")
    }else if (menorIgual3(notas) && Promedio(notas) < 6){
        println("NO APROBADO")
    }else if(Promedio(notas) < 6 && !menorIgual3(notas)){
        println("Recuperatorio")
    }else if(Promedio(notas) >= 6 && menorIgual3(notas)){
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
        if (numero == null || numero>10 || numero < 1) println("ERROR: digite un numero decimal entre 1-10")
    }while (numero == null || numero>10 || numero < 1)
    return numero;
}



fun Promedio(notas:FloatArray):Float{
    var notasT:Float = 0.0f;
    for (i in notas.indices){
        notasT+=notas[i];
    }
    return notasT/notas.size;
}

/**
 * Indica si tiene alumnos con nota menor o igual a 3
 *
 * @param materias es el array de materias
 * @return devuelve true si alguna nota es menor o igual a 3
 */
fun menorIgual3(materias:FloatArray):Boolean {
    var validar = false;
    for (i in materias.indices) {
            if (materias[i] <= 3) {
                validar = true;
            }
    }
    return validar;
}