package com.utn.kotlin.interfaces.implementaciones

import com.utn.kotlin.interfaces.I_InterfaceHija
import com.utn.kotlin.interfaces.I_InterfaceHija2

class ClaseImplementacion2 :  I_InterfaceHija, I_InterfaceHija2 {
    override fun primerMetodo() = super<I_InterfaceHija>.primerMetodo()
}