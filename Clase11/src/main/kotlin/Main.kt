import com.utn.kotlin.Auto

fun main() {
    //declaramos una variable
//    var entero : Int = 10
    var entero = 10
    //de la misma manera se declara un objeto
//    var miAuto : Automovil = Automovil()
    var miAuto = Automovil()

    var arrayAuto : Array<Automovil?> = Array(3) {null}
    for (i in arrayAuto.indices){
        println("Escriba marca");
        arrayAuto[i]?.cargarColor(readLine()!!);

    }
    //con esto hemos creado un objeto de la clase Automovil()
    //también se lo conoce como instanciar una clase

    //asignamos valores a las propiedades del objeto
//    miAuto.marca = "Ford"
//    miAuto.modelo = "Ecosport"
//    miAuto.color = "Gris"

    //leer u obtener los valores de sus propiedades
//    println("Marca de miAuto: ${miAuto.marca}")
//    println("Modelo de miAuto: ${miAuto.modelo}")
//    println("Color de miAuto: ${miAuto.color}")

    var otroAuto = Automovil()
//    otroAuto.marca no puedo acceder directamente a las propiedades porque son private
    otroAuto.cargarMarca("Ford")
    otroAuto.cargarModelo("Ka")
    otroAuto.cargarColor("Negro")

    //obtener el valor de los atributos
    println("La marca de otroAuto es: ${otroAuto.obtenerMarca()}")
    println("El modelo de otroAuto es: ${otroAuto.obtenerModelo()}")
    println("El color de otroAuto es: ${otroAuto.obtenerColor()}")

    /*
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */

    var auto1 = Auto("Citroen","C4","Blanco")

    var auto2 = Auto("Ford", "Fiesta", "Verde")

    println(auto1.marcaModeloColor)
    println(auto2.marcaModeloColor)

    var auto3 = Auto("Toyota", "Corola", "Blanco","Carlos")
    println(auto3.marcaModeloColor)
}