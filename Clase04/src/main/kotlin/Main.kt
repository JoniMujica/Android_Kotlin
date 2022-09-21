fun main() {
    fun suma(numero1:Int, numero2:Int):Int{ //a esta primera línea se la conoce como firma de la función
        //acá va el cuerpo de la función. Es decir, lo que hace la función.
        return numero1 + numero2    //return nos indica lo que va a devolver la función
    }

    var resultado : Int = suma(2,3) //podemos no poner el tipo de dato a la variable, la infiere
    println(resultado)

    var num1 = 12
    var num2 = 20

    resultado = suma(num1,num2)
    println(resultado)

    println(suma(15,15))

    fun retornarNumero10():Int{ //función que no lleva parámetros
        return 10
    }

    var numero10 = retornarNumero10()
    println(numero10)

    fun saludar():String{   //función que no retorna valor. Realiza una acción.
        return "Hola Mundo!!"
    }

    println(saludar())

//    numero10 = saludar()  error, no son del mismo tipo de dato

    var saludo = saludar()
    println(saludo)

    fun saludarNombre(nombre:String){
        println("Hola $nombre")
    }

    saludarNombre("María")

    var baseCuadrado = 2.49f
    var alturaCuadrado = 4.56f

    /**
     * Esta función calcula el área de un cuadrado
     * @param base = es la base del cuadrado
     * @param altura = es la altura del cuadrado
     * @return devuelve la base por la altura
     */
    fun calcularAreaCuadrado(base:Float, altura:Float) = base * altura //forma abreviada

    var area = calcularAreaCuadrado(baseCuadrado,alturaCuadrado)
    println(area)

    fun despedida() = println("chau")

    despedida()

    //Unit es una palabra reservada indica que una función no retorna valor, es similar al void en Java
    //No es necesario ponerla si la función no retorna nada
}