import com.utn.kotlin.Auto
import com.utn.kotlin.Moto

fun main() {
    var moto1 = Moto("Zuzuki","1300","Negra")
    println(moto1.marca) //accedo al valor de la marca por medio del get (implicito)
    moto1.marca = "Yamaha";
    println(moto1.marca)

    //creamos un objeto de auto con un valor de parametro por defecto

    var auto2 = Auto(modelo="Fiesta",color="Negro")
    println(auto2.marcaModeloColor)
    moto1.acelerar()
    moto1.frenar()
    moto1.acelerar(25)
    moto1.acelerar(25,true)
}