package com.utn.kotlin.test

import com.utn.kotlin.interfaces.I_Archivo
import com.utn.kotlin.interfaces.implementaciones.*

fun main() {
    /*
    Las interfaces en Kotlin son tipos personalizados que definen una forma de comportamiento que deben seguir sus
    implementaciones.
    - No se pueden instanciar. No se permiten la declaración de constructores.
    - Pueden contener propiedades. Pero no se puede definir el estado.
    - Las propiedades pueden definir implementaciones para poder acceder a ellas.
    - Pueden contener métodos con implementación o abstractos.
    - Las propiedades y métodos pueden ser sobrescritos sin necesidad de haberlos marcados como open.
    - Una clase puede implementar una o más interfaces.
    - Una interfaz puede derivar ("heredar") de otra interfaz.
    - Una interfaz puede ser implementada por varias clases que no estén relacionadas entre sí.
     */

    val ejemplo1 = ClaseImplementacion()
    println(ejemplo1.propiedad1)
    println(ejemplo1.propiedad2)
    println(ejemplo1.metodo1())
    println(ejemplo1.metodo2())

    val ejemplo2 = ClaseImplementacion2()
    println(ejemplo2.primerMetodo())

    val ejemplo3 = ClaseImplementacion3()
    println(ejemplo3.primerMetodo())


    //Ejemplo de manejo de archivos
    //referencia a la Interfaz padre
    println("\nEjemplo de manejo de archivos")
    lateinit var archivo : I_Archivo

    //inicialización
//    archivo = ArchivoTexto()
//    //cambio la implementación
//    archivo = ArchivoBinario()
//
//    println(archivo.tipoArchivo)
//    archivo.setText("Hola")
//    println(archivo.getText())
//    archivo.info()

    do {
        println("Ingrese qué archivo quiere obtener:")
        println("1 -> Archivo de texto\n2 -> Archivo binario\n3 -> Archivo de la nube")
        var opcion = readln().toIntOrNull() ?: 0
        when(opcion){
            1 -> archivo = ArchivoTexto()
            2 -> archivo = ArchivoBinario()
            3 -> archivo = ArchivoNube()
        }
    }while(opcion !in 1..3)

    println("Usted está descargando un ${archivo.tipoArchivo}")





}