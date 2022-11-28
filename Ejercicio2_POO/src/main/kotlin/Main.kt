import com.utn.kotlin.Semaforo
import includes.InputString

fun main() {
    var semaforo1 = Semaforo()
    var semaforo2 = Semaforo();
    PedirColor(semaforo1,semaforo2)
}

fun PedirColor(s1:Semaforo,s2:Semaforo){
    var res:String=""
    do {
        res = InputString()
        cambiarColor(res,s1,s2)
        println("Semaforo 1 -> ${s1.GetColor()} \tSemaforo 2 -> ${s2.GetColor()}")
    }while (res != "0")
}

fun cambiarColor(color:String,s1:Semaforo,s2:Semaforo){
    s1.setColor(color)
    if (color == "verde"){
        s2.setColor("rojo")
    }else if (color == "rojo"){
        s2.setColor("verde")
    }else if (color == "amarillo"){
        s2.setColor(color)
    }
}