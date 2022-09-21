fun main() {
    //llamada a una función con argumentos predefinidos
    var resultado = suma()
    println(resultado)

    resultado = suma(10)
    println(resultado)

    resultado = suma(10,50)
    println(resultado)

    /*
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        ESTRUCTURAS CONDICIONALES
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */

    /*
    Las estructuras condicionales nos permiten manejar el flujo del programa.
    Evalúan condiciones para tomar decisiones.
     */

    //Estructura if

    var nro1 = 10
    var nro2 = 10

    println("\n*** Estructura if ***")
    if (nro1 > nro2){ //inicio del cuerpo del if
        println("El número 1 es mayor al número 2") //se ejecuta si la condición es verdadera
    } //final del cuerpo del if
    //si la condición a evaluar es falsa, no se ejecuta el cuerpo del if y continúa el programa normalmente

    if (3 > 2){
        println("El primer número es mayor que el segundo")
    }

    if (nro1 != nro2){
        println("Número 1 y número 2 son distintos")
    }

    var log = true
    if (log){
        println("Log es una variable booleana verdadera")
    }

    //if en línea
    println("\n*** if en línea ***")
    if (2 < 3) println("El primer número es menor que el segundo")

    //Estructura if else
    println("\n*** Estructura if-else ***")
    if (nro1 > nro2){
        println("El número 1 es mayor que el número 2") //se ejecuta si la condición es verdadera
    }else{
        println("El número 1 no es mayor que el número 2") //se ejecuta si la condición es falsa
    }

    //Estructura if-else if-else (if anidado)
    println("\n*** Estructura if-else if-else (if anidado) ***")
    if (nro1 > nro2){
        println("El número1 es mayor que el número2")
    }else if (nro1 < nro2){
        println("El número2 es mayor que el número1")
    }else{
        println("Ambos números son iguales")
    }

    var tienePasaporte = true
    var edad = 18

    if(tienePasaporte){
        if (edad >= 18){
            println("Puede viajar solo.")
        }else{
            println("Puede viajar, pero acompañado.")
        }
    }else{
        println("No puede viajar.")
    }

    edad = 60
    var sexo = "mujer"

    if(sexo == "hombre" && edad >= 65) println("Puede jubilarse")
    else if(sexo == "mujer" && edad >= 60) println("Puede jubilarse")
    else println("Aún no puede jubilarse")

    if (sexo.equals("hombre") && edad >= 65 || sexo.equals("mujer") && edad >= 60) println("Puede jubilarse")
    else println("Aún no puede jubilarse")

    //Podemos utilizar el if para darle valor a una variable
    println("\n*** if para asignar valor a una variable ***")
    //supongamos que tenemos un personaje de videojuegos que tiene un valor de vida y un valor de ataque
    var vida = 10
    var ataque : Int
    //el valor del ataque se lo vamos a asignar con un if
    if(vida > 50) ataque = 20
    else ataque = 10

    println("El valor del ataque es de $ataque")

    //También podemos utilizar el if como una expresión
    println("\n*** if como expresión ***")
    ataque = if(vida > 50){
        println("Estoy bien!")
        20
    }else{
        println("No estoy del todo bien...")
        10
    }

    println("El valor del ataque es $ataque")

    /*
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        ESTRUCTURA WHEN
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */

    println("\n*** Estructura when ***")

    var mes = 70

    when(mes){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("El número no corresponde a ningún mes.")
        //si no colocamos el else, directamente no hace nada y continúa con el programa
    }

    when(mes){
        1,2,3 -> println("Mes del primer trimestre")
        4,5,6 -> println("Mes del segundo trimestre")
        7,8,9 -> println("Mes del tercer trimestre")
        10,11,12 -> println("Mes del cuarto trimestre")
    }

    when(mes){
        in 1..6 -> println("Mes del primer semestre del año")
        in 7..12 -> println("Mes del segundo semestre del año")
        else -> println("El número no corresponde a ningún mes")
    }

    //Podemos utilizar el when como un if
    println("\n*** when como if ***")
    nro1 = 12
    when{
      nro1 > 0 -> println("Nro1 es un número positivo")
      nro1 == 0 -> println("Nro1 es un 0")
      else -> println("Nro1 es un número negativo")
    }

    //También podemos utilizar el when como una expresión
    println("\n*** uso de when como expresión ***")
    var puesto = 1
    var medalla = when(puesto){
        1 -> "Oro"
        2 -> "Plata"
        3 -> "Bronce"
        else -> "Ninguna :-("
    }
    println(medalla)

    /*
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        ITERADORES - ESTRUCTURAS DE REPETICIÓN
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */

    //Estructura for
    println("\n*** Estructura for ***")
    for (i in 1..10) println("Hola")
    println("\n*** en orden ascendente de a 1: ***")
    for (i in 1..10) println(i)
    println("\n*** en orden ascendente de a 2: ***")
    for (i in 1..10 step 2) println(i)
    println("\n*** en orden descendente de a 1: ***")
    for (i in 10 downTo 1) println(i)
    println("\n*** en orden descendente de a 2: ***")
    for (i in 10 downTo 1 step 2) println(i)
    println("\n*** excluyendo el límite superior: ***")
    for (i in 1 until 10) println(i)
    println("\n*** recorrido de caracteres: ***")
    for (i in 'a'..'f') println(i)
    println("\n*** recorrido de String: ***")
    for (i in "Juan") println(i)
    var nombre = "Marcela"
    println("\n*** recorrido de String en línea: ***")
    for (i in nombre) print(i)
    println("\n*** recorrido con los caracteres separados: ***")
    for (i in nombre) print("$i ")
    println("\n*** recorrido de caracteres/String en forma inversa: ***")
    for (i in nombre.reversed()) print(i)


}

//función con argumentos predefinidos
fun suma(numero1: Int = 2, numero2 : Int = 30) : Int {
    return numero1 +numero2
//    println("hola") esta línea no se ejecuta
}