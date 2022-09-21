fun main() {
    /*
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     ARREGLOS O ARRAYS
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */

    //creación de un Array
    val arreglo : Array<Int> = arrayOf(2,4,8,16,32,64)

    //otra forma equivalente de creación
    val arreglo2 : IntArray = intArrayOf(2,4,8,16,32,64)

    //creación de un Array vacío
    val arreglo3 : Array<Int> = Array(5,{0})
    val arreglo4 : Array<String> = Array(5,{""})

    //inicialización de un Array personalizado vacío
    val arreglo5 : IntArray = IntArray(5)
    val arreglo6 : CharArray = CharArray(5) //en Kotlin no existe el StringArray

    //declaración y asignación de valores a un Array de enteros
    val numeros = arrayOf(12,34,56,78,88)

    //obtener la primera posición del arreglo
    var valor1 = numeros[0]
    println(valor1)
    var valor_1 = numeros.get(0) //ambos llamados son equivalentes
    println(valor_1)

    //asignación y cambio de valores
    println(numeros[2])
    numeros[2] = 50 //modificamos el valor
    println(numeros[2])
    numeros.set(3,50)   //ambas llamadas son equivalentes
    println(numeros[3])

    //longitud de un Array
    val longitud = numeros.size
    println(longitud)

    //recorrido de Arrays
    val dias = arrayOf("lunes","martes","miércoles","jueves","viernes","sábado","domingo")
    for (i in dias) println(i)
    for (i in dias.indices) println("La posición $i tiene el valor ${dias[i]}")
    println("")
    for ((i,v) in dias.withIndex()) println("La posición $i tiene el valor $v")
    println(dias.joinToString()) //esta función imprime todos los elementos del Array en línea separados con coma
    println(dias.joinToString(" * ")) //si pasamos un String como parámetro, se tomará para el separador

    //carga de datos en un Array
    //si quisiéramos guardar los números del 1 al 10 en un Array
    var contador = 1
    val arregloNuevo = IntArray(10)
    for (i in arregloNuevo.indices){
        arregloNuevo[i] = contador
        contador++
    }
    //mostramos el contenido del arreglo
    for (i in arregloNuevo) println(i)

    //otra forma de completar un Array
    val otroArreglo = Array<String>(4,{""})
    for (i in otroArreglo.indices){
        println("Ingrese un nombre:")
        otroArreglo[i] = readln()
    }
    println(otroArreglo.joinToString())


}