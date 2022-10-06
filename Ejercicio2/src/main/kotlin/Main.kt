fun main() {
    var Prod_golosinas = arrayOf("Bubbaloo","Bon o Bon","Rhodesia","Pico Dulce");
    var Val_golosinas : IntArray = intArrayOf(7,40,80,25);
    Menu(Prod_golosinas,Val_golosinas)
    CobraryDevolver(sumatoriaCobro(Val_golosinas))
}
fun Menu(golosinas:Array<String>,precios:IntArray){
    println("======================MENU DE COMPASS, Seleccione un producto=================")
    for (i in golosinas.indices){
        println("${i+1}-${golosinas[i]} -> $${precios[i]}")
    }
    println("0-Exit")
}
fun sumatoriaCobro(precios:IntArray):Int{
    var num = 0;
    var total:Int = 0;
    do {
        num = inputInt();
        if (ExisteProducto(num) && num != 0){
            total += precios[num-1]
            println("Total a pagar: $${total}")
        }
    }while (num != 0 || !ExisteProducto(num))
2
    return total;
}

fun CobraryDevolver(total:Int){
    println("Por favor Ingrese el saldo $${total} para efectuar la compra: ")
    var saldo = inputInt();
    while (saldo-total < 0){
        println("Saldo insuficiente, por favor ingrese el saldo total de la compra")
        saldo = inputInt();
    }
    var vuelto = saldo-total;
    println("Su vuelto es $${vuelto}")
    var old = 0;
    var contador = 0;
    while (vuelto>=0){
        var billete = BVuelto(vuelto)
        vuelto-=billete
        if(old == 0) old = billete;
        if (old == billete){
            contador++
            if (vuelto == 0) break;
        }else{
            println("cantidad de billetes de $${old} x$contador")
            contador = 1;
            old = billete;
        }
    }
}

/**
 * Esta funcion sirve para obtener el billete mas alto a devolver de forma ordenada
 *
 * @param faltante es la cantidad de vuelto restante para llegar a cero
 * @return devuelve el billete mas alto cuyo diferencia con faltante es mayor a cero
 */
fun BVuelto(faltante:Int):Int{

    var billetes:IntArray = intArrayOf(100,50,20,10,5,2,1);
    for (i in billetes.indices){
        if (faltante-billetes[i]>=0){
            return billetes[i];
        }
    }
    return 0;
}

fun inputInt():Int{
    var numero:Int?;
    do {
        println("Ingrese un valor: ")
        numero = readln().toIntOrNull()
        if (numero == null) println("ERROR: digite un numero entero")
    }while (numero == null)
    return numero;
}

/**
 * Esta funcion valida el Id del producto de ka expendedora de golosinas
 * @param productoId es el valor ingresado por el usuario
 * @return devuelve true si el producto existe
 */
fun ExisteProducto(productoId:Int):Boolean{
    if (productoId < 0 || productoId > 4){
        println("Error, producto invalido")
        return false;
    }
    return true;
}