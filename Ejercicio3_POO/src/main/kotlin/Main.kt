import com.utn.kotlin.Cliente
import include.ExisteItem
import include.inputDouble
import include.inputInt

fun main() {
    var cliente = Cliente("Jonathan","Mujica",194143)
    var cliente2 = Cliente("Juan","Topo",134634)
    Menu()
    opciones(cliente)
    println("\n\n\n\n\n\n\n\n")
    Menu()
    opciones(cliente2)

    println("Cliente ${cliente.GetNombre()} ${cliente.GetApellido()} n° cuenta ${cliente.GetCuenta()}, Saldo:${cliente.GetSaldo()}")
    println("Cliente ${cliente2.GetNombre()} ${cliente2.GetApellido()} n° cuenta ${cliente2.GetCuenta()}, Saldo:${cliente2.GetSaldo()}")
}
fun Menu(){
    println("======================MENU CAJERO=================")
    println("1-Depositar\n2-Extraer\n0-Salir")
}
fun opciones(cliente:Cliente){
    var num = 0;
    do {
        num = inputInt();
        if (ExisteItem(num) && num != 0){
            Operar(num,cliente)
        }
    }while (num != 0 || !ExisteItem(num))
}
fun Operar(item:Int,cliente:Cliente){
    if (item == 1){
        cliente.Deposito(inputDouble())
    }else if (item == 2){
        cliente.Extraccion(inputDouble())
    }
}