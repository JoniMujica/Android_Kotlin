package com.utn.kotlin.interfaces.implementaciones

import com.utn.kotlin.interfaces.I_PrimeraInterface
import com.utn.kotlin.interfaces.I_SegundaInterface

class ClaseImplementacion3 : I_PrimeraInterface, I_SegundaInterface {
    //se debe sobrescribir el método para evitar el conflicto
//    override fun primerMetodo() = "Primer método desde la clase que lo implementa"

    //o utilizar el operador diamante para indicar de dónde estamos llamando al método
    override fun primerMetodo() = super<I_SegundaInterface>.primerMetodo()

    override fun segundoMetodo() = "Segundo método desde la clase que implementa"

}