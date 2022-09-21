import java.util.*

fun main() {
    var variable1 : Int = 2
    var variable2 : Int = variable1
    println(variable1)
    println(variable2)

    var corto : Short = 77
//    var entero : Int = corto  error, no son el mismo tipo de dato.
    //conversión de tipos
    var entero : Int = corto.toInt() //convertir la variable Short a Int con toInt()

    /*
    - toByte()
    - toShort()
    - toInt()
    - toLong()
    - toFloat()
    - toDouble()
    - toChar()
    - toString()
     */

    //Operadores

    //Operadores de concatenación
    var cadena1 : String  = "Hola"
    var cadena2 : String = " "
    var cadena3 : String = "Mundo"
    var cadena4 : String = "!!"

    println(cadena1 + cadena2 + cadena3 + cadena4)  //concatenar con el +
    println("La primera palabra es: " + cadena1)

    //Otra forma de concatenar es con los Strings Templates
    println("La primera palabra es: $cadena1")

    //Operadores Aritméticos (son binarios, se necesitan dos operandos)
    var a = 10
    var b = 5

    println("Suma:")
    println(a + b)
    println(a.plus(b)) // es igual a "a + b"
    println("Resta:")
    println(a - b)
    println("Multiplicación:")
    println(a * b)
    println("División:")
    println(a / b)
    println("Resto:")
    println(a % b)

    var c = 2.9f
    var resultado = a + c
    println("Suma con resultado FLoat")
    println(resultado) //realiza la operación porque no le declaramos tipo de dato a la variable

//    var resultado2 : Int = a + c no puedo almacenar en un Int una operación con Float
    var resultado2 : Int = (a + c).toInt() //también podría haber convertido a c solamente
    println("Suma con resultado2:")
    println(resultado2) //descarta los valores decimales

    //Operadores incrementales y decrementales (son unarios)
    a++ // con el ++ incremento en 1 el valor de la variable
    println("Incremento de a "+a)
    a-- //con el -- decremento en 1 el valor de la variable
    println("Decremento de a $a")

    //Operadores de Asignación
    a += b //es igual a: "a = a + b"
    println("+=")
    println(a)
    a -= b //es igual a: "a = a - b"
    println("-=")
    println(a)
    a *= b
    println("*=")
    println(a)
    a /= b
    println("/=\n$a")

    //Operadores relacionales (son operadores binarios - resultado es booleano)
    a = 20
    b = 25

    println("$a es igual a $b: ${a == b}") //con un solo = estaría asignado el valor y no comparando
    println("$a es diferente a $b: ${a != b}")
    println("$a es mayor a $b: ${a > b}")
    println("$a es menor a $b: ${a < b}")
    println("$a es mayor o igual a $b: ${a >= b}")
    println("$a es menor o igual a $b: ${a <= b}")

    /*
    TABLA DE VERDAD
    A   B   AND OR
    V   V   V   V
    V   F   F   V
    F   V   F   V
    F   F   F   F

    NEGACIÓN (NOT)
    A   NOT
    V   F
    F   V
     */

    //Operadores Lógicos (son operadores de tipo booleano, el resultado es booleano)
    /*
    && AND
    || or
    !  NOT
     */

    var log1 = true
    var log2 = false

    println("AND:")
    println(log1 && log2)
    println("OR:")
    println(log1 || log2)
    println("NOT:")
    println(!log1)

    //Manejo de Strings
    var nombre = "Maximiliano"
    println("Variable: $nombre")
    println("length: ${nombre.length}") //devuelve un entero con la longitud
    println("isEmpty(): ${nombre.isEmpty()}" ) //devuelve un booleano que indica si la cadena está vacía
    println("contains: ${nombre.contains("mili")}") //devuelve un booleano que indica si la cadena contiene la subcadena pasada
    println("contains: ${nombre.contains("Mili")}") //distingue las mayúsculas y minúsculas
    println("substring: ${nombre.substring(3)}") //devuelve una cadena desde la posición indicada
    println("substring: ${nombre.substring(2,6)}") //devuelve una cadena que esté dentro del rango indicado
    println("replace: ${nombre.replace('a','e')}") //reemplazamos caracteres
    println("capitalize(deprecado): ${nombre.capitalize()}") //cambia la primera letra a mayúscula (deprecado)
    println("capitalize: ${nombre.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}")
    println("decapitalize(deprecado): ${nombre.decapitalize()}") //cambia la primera letra a minúscula (deprecado)
    println("decapitalize: ${nombre.replaceFirstChar { it.lowercase(Locale.getDefault()) }}")
    println("toUpperCase(deprecado): ${nombre.toUpperCase()}") //pasa toda la cadena a mayúscula
    println("toUpperCase(deprecado): ${nombre.uppercase()}")
    println("toLowerCase(deprecado): ${nombre.toLowerCase()}") //pasa toda la cadena a minúscula
    println("toLowerCase(deprecado): ${nombre.lowercase()}")

    //Comparación de Strings
    var palabra1 = "hola"
    var palabra2 = "Hola"

    //operadores de comparación ==
    //devuelve true si tienen el mismo valor
    println("palabra1 == palabra2: ${palabra1 == palabra2}")

    //operador de integridad referencial ===
    //devuelve true si las dos variables apuntan al mismo objeto y tienen el mismo valor
    println("palabra1 === palabra2: ${palabra1 === palabra2}")

    //equals()
    //es un método que devuelve el mismo resultado que el operador ==
    println("palabra1.equals(palabra2): ${palabra1.equals(palabra2)}") //compara teniendo en cuenta mayúsculas y minúsculas
    println("palabra1.equals(palabra2,true) ${palabra1.equals(palabra2,true)}") //no tiene en cuenta mayúsculas ni minúsculas

    //compareTo()
    //Se utiliza para verificar el orden de 2 cadenas. Devuelve un valor entero.
    println("palabra1.compareTo(palabra2): ${palabra1.compareTo(palabra2)}")








}