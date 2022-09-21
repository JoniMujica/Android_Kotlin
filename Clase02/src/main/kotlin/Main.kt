fun main(){
    println("Hola Mundo!")
    //sout + tab (atajo de teclado)


    //Comentarios
    //el compilador los ignora y no los ejecuta

    //comentario en línea
    //este es otro comentario en línea

    /*
    comentarios en bloque
    permiten realizar comentarios
    en varias líneas
     */

    //TODO este comentario sirve para generar un recordatorio
    // otra línea de comentario

    //FIXME
    // es igual al anterior
    // pero permite escribir
    // en varias líneas

    /**
     * Comentarios KDoc
     * son de documentación
     * los usamos para documentar aspectos de distintas entidades
     * como por ej. una clase, una función, etc.
     */

    // Variables
    //mutables -> var -> pueden cambiar su valor
    //inmutables -> val -> no pueden cambiar su valor

    var num1 : Int // declaración de una variable
    num1 = 7 // asignación de valor de una variable
    println(num1) // impresión de variable sin comillas, imprime su valor
    println("num1") //con las comillas, se imprime lo que esté escrito dentro
    num1 = 9 // modifico el valor de la variable
    println(num1)

//    var num1 : Int    error, la variable ya está creada, no la puedo volver a declarar
//    var num1 : Char   error, aunque cambie el tipo de dato, la variable ya está declarada

    val num2 : Int = 2 //declaración y asignación de variable en una misma línea
    val num3 = 300 //Kotlin infiere el tipo de dato por medio de la literal. No hace falta declarar que es un entero.

//    num2 = 3  error, es una variable inmutable, no se puede cambiar su valor.

    /*
    Palabras reservadas
    interface   continue    super   this    for     if
    break       try         return  do      package class
    else        while       is      null    throw   object  when
     */

    /*
    Identificadores
    Un identificador comienza con una letra o un guión bajo.
    Puede incluir pero no comenzar con un número.
    No se permiten los espacios en blanco.
    No puede contener los símbolos @, #, -, +, /.
    Distinguen entre mayúsculas y minúsculas.
    No pueden ser palabras reservadas.
    Recomendación: los nombres de variables deben ser declarativos del dato que guardan.

    ¿Cómo resolvemos el tema de los espacios en blanco?
    Estilos de escritura:
    camelCase -> estaEsUnaFraseEnCamelCase (también conocida como lower Camel Case) para variables, objetos
    PascalCase -> EstaEsUnaFraseEnPascalCase (también conocida como upper Camel Case) para Clases, Interfaces
    snake case -> esta_es_una_frase_en_snake_case (poco utilizada en Kotlin/Java, se la utiliza más en BD)
     */

    //Tipos de datos

    //Numéricos - enteros
    var nro1 : Byte = -120 // 8 bits 256 valores van desde el -128 al 127
    var nro2 : Short = 1789 //16 bits 65.536 valores van desde -32768 al 32767
    var nro3 : Int = 356845 //32 bits 4.294.967.296 valores (es el más utilizado)
    var nro4 : Long = 1254687465 //64 bits, es el menos utilizado. Es para números demasiado grandes.

    //Numéricos - reales
    var nro5 : Float = 5.23f //(32 bits) los tipos de datos Float deben llevar una f al final de la literal
//    var nro6 : Float = 5,23f  error, los decimales se separan con .
//    var nro6 : Float = 5.23   error, falta la f al final de la literal
    var nro6 : Double = 2.34 //(64 bits) no se agrega ninguna letra en la literal

    var nro7 : Float = 10.0f / 3.0f
    var nro8 : Double = 10.0 / 3.0
    println(nro7)
    println(nro8)

    //Numéricos sin signo
    //Nos permiten almacenar más números positivos al no registrar los negativos
    var nro9 : UByte = 255u
    //Se antepone la letra U antes del tipo de dato y al final de la literal

    //Caracter
    //representa un único caracter (letra, número, símbolo) encerrado entre comillas simples
    var numero : Char = '2'
    var letra : Char = 'w'
    var simbolo : Char = '@'

    //Cadenas de caracteres
    //se los representa encerrados entre comillas dobles
    var saludo : String = "Hola Mundo!"
    println(saludo)

    /*
    Caracteres de escape
    \t : tabulación
    \b : retroceso
    \r : retorno de carro
    \n : salto de línea
    \' : apóstrofe
    \" : comilla doble
    \\ : barra invertida
    \$ : símbolo pesos
     */

    println("Hola\nMundo!")
    println("Hola\tMundo!")
    println("Hola \'Mundo!\'")
    println("\"Hola\" \'Mundo!\'")

    //String en múltiples líneas
    var frase : String = """
        Kotlin es un lenguaje de alto nivel
        que utilizaremos para programar
        en Android Studio
    """.trimIndent()

    println(frase)

    //Booleano - verdadero o falso (true or false)
    var verdadero : Boolean = true
    var falso : Boolean = false
    println(verdadero)
    println(falso)

    //Arreglos o Arrays
    //Un arreglo es una estructura de datos que permite almacenar un conjunto de datos del mismo tipo
    //Va a guardar en una misma y única variable, variables del mismo tipo de dato.
    //El tamaño del arreglo es fijo, no se puede cambiar.
    //Se acceden a sus elementos por medio de índices.
    //Los índices comienzan en la posición 0 y finalizan en la posición que sería longitud del arreglo -1
    val numeros : IntArray //declaración del arreglo
    numeros = IntArray(5) //creamos un arreglo de 5 posiciones
    numeros[0] = 12 //asignamos los valores en cada posición
    numeros[1] = 9
    numeros[2] = -23
    numeros[3] = 155
    numeros[4] = 90
//    numeros[5] = 2    error, no compila. Se detiene abruptamente el programa. No existe la posición [5]
    val numeros2 : Array<Int> = arrayOf(23,59,54,21) //en una misma línea, declaramos el arreglo,
                                                    // el tipo de datos, asignamos valores y le damos longitud
    val dias = arrayOf("lunes","martes", "miércoles", "jueves", "viernes", "sábado", "domingo") // Kotlin infiere el tipo de datos
    println(dias[0]) //accedo a la posición del arreglo, dada por el índice
    println(dias[1])
    println(dias[2])
    println(dias[3])
    println(dias[4])
    println(dias[5])
    println(dias[6])
//    println(dias[7])  error, no existe la posición [7]

    


























    //kljdlkjasdkljasdl


}