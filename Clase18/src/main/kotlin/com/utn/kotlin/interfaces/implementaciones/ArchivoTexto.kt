package com.utn.kotlin.interfaces.implementaciones

import com.utn.kotlin.interfaces.I_Archivo

class ArchivoTexto : I_Archivo {
    override val tipoArchivo = "Archivo de texto"

    override fun setText(texto: String) {
        println("Escribiendo \"$texto\" en archivo de texto...")
    }

    override fun getText() = "Obteniendo texto del archivo de texto..."


}