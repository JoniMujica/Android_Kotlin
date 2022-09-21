fun main() {
    /*
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        ESTRUCTURA WHILE
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */

    //El código del while se ejecuta siempre que la condición a evaluar sea verdadera.
    println("\n*** Estructura while ***")
    var contador = 1
    while (contador <= 10){
        println(contador)
        contador++
    }

    //bucle infinito = el programa se queda corriendo sin parar metido en un loop infinito
//    while (contador >= 1){
//        println(contador)
//        contador++
//    }

    //uso de acumuladores para contar
    println("\n*** uso de acumuladores para contar ***")
    var acumulador = 0
    contador = 1
    while (contador <= 10){
        acumulador += contador
        contador++
    }
    println(acumulador) // acumulador = 1+2+3+4+5+6+7+8+9+10

    //imprimir los números del 1 al 10 uno al lado del otro sin imprimir el 3, 5 y 6
    println("\n*** Impresión del 1 al 10 sin 3, 5 y 6 ***")
    contador = 1
    while (contador <= 10){
        if (contador != 3 && contador != 5 && contador != 6) print(contador)
        contador++
    }

    //misma solución pero utilizando estructura for
    println("\n*** misma solución pero utilizando for ***")
    for (i in 1..10) if (i != 3 && i != 5 && i != 6) print("$i ")

    //captura de datos por teclado
    println("\n\n*** Captura de datos por teclado ***")
//    println("Ingrese su nombre:")
////    var nombre = readLine()
//    var nombre = readln() //ambas funciones son válidas para leer un String
//    println("Bienvenido usuario $nombre.")

//    println("Ingrese su edad:")
//    var edad = readLine()!!.toInt()
////    var edad = readln().toInt()   no hace falta agregarle el operador de aserción
//    println("Su edad es de $edad años.")

    //El operador de aserción !! le avisa a Kotlin que no se ingresará un valor nulo. Entonces se permite la ejecución.
    //Si no recibe un número, el programa fallará.
    //null : es un valor que representa que una variable está vacía o que no apunta a ningún dato válido.
    //al no ingresar un número y que Kotlin intente pasarlo, se produce una exception.
    //Las exceptions son problemas que ocurren en tiempo de ejecución y que detienen el programa abruptamente.

    /*
    Kotlin es null-safety (seguro contra nulos)
    El lenguaje incorporó una serie de características para disminuir las posibilidades de caer en una excepción de nulos.
    Lo que sería un a nullPointerException
    Los nulos se gestionan en forma segura.
    En principio en Kotlin los objetos son not-null por defecto, es decir que a ningún objeto se le puede asignar un null.
    A menos que se exprese lo contrario.
     */

    //la siguiente sentencia no compilará:
//    var x : Int = null

    //para indicar que la variable pueda aceptar nulos, debemos marcar al tipo de dato con el operador de llamada segura "?"
    var x : Int? = null

    //este operador nos permite almacenar valores nulos, pero se deben realizar comprobaciones al operar con la variable
    //para no caer en una excepción.
    //por ejemplo, la siguiente sentencia no compilará:
//    var y : Double = x.toDouble()

    //deberíamos comprobar si "x" es nulo antes de realizar la conversión
//    if (x != null){
//        var y = x.toDouble()
//    }
    //en este caso si la variable no es nula, se ejecuta la operación, caso contrario, no hace nada.

    //el operador de aserción nos permite desactivar las comprobaciones, pero nos exponemos a caer en la exception
//    var y = x!!.toDouble()

    //podemos utilizar el operador de llamada segura
//    var y = x?.toDouble()
    //lo que sucede en este caso es que si la variable "x" es null, devolverá un null, y la variable "y" será del tipo "Double?"
    //admitiendo nulos
//    println("El valor de y es $y")

    //si quisiéramos guardar otro valor por defecto en vez de null
//    var y = if (x != null){
//        x.toDouble()
//    }else{
//        0.0
//    }
    //lo mismo que lo anterior pero en forma abreviada
//    var y = if (x!=null) x.toDouble() else 0.0
//    println("El valor de y es $y")

    //para representar lo anterior podemos utilizar el operador Elvis ?:
    var y = x?.toDouble() ?: 0.0
    println("El valor de y es $y")

    //en el ejemplo anterior que estábamos viendo de convertir la edad podemos utilizar toIntOrNull()
//    println("\nIngrese su edad:")
//    var edad = readln().toIntOrNull()
    //de esta manera evitamos caer en la exception
    //la función retorna un entero si lo puede convertir o null si no puede.
    //edad pasa a ser del tipo Int?
    //en este caso podemos realizar la salida de acuerdo al valor que ingresó
//    var edad = readln().toInt() ?: 0 falla porque lo intenta pasar a entero y no puede
//    if (edad!=null) println("Su edad es de $edad años.")
//    else println("No ingresó una edad válida.")

    //también existen toByteOrNull(), toShortOrNull(), toLongOrNull(), toFloatOrNull(), toDoubleOrNull()
    println("Ingrese su sueldo:")
//    var sueldo = readln().toFloatOrNull() ?: 0
//    println("Su sueldo es de $sueldo")

    /*
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        ESTRUCTURA DO-WHILE
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */

    //La estructura do-while a diferencia del while, primer se ejecuta y luego evalúa la condición.
    //Con lo cual el bloque de sentencias se ejecuta siempre al menos una vez

    println("\n*** Estructura do-while ***")
    contador = 0
    do {
        contador++
        println("¿Cuál es la capital de Argentina?")
        println("a. Montevideo")
        println("b. La Paz")
        println("c. Buenos Aires")
        println("d. Bogotá")
        println("(solo elija la letra que corresponda a su respuesta)")
        println("Respuesta:")
        val eleccion = readln().lowercase()
        val retorna = eleccion != "c"
        if (retorna) println("Incorrecto. Intente otra vez:")
        else println("Correcto. Felicitaciones !! Usted acertó luego de $contador intento/s.")
    }while (retorna)
    println("*** Fin del bucle do-while ***")
}