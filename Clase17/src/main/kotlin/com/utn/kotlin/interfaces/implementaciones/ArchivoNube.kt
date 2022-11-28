package com.utn.kotlin.interfaces.implementaciones

import com.utn.kotlin.interfaces.I_Archivo

class ArchivoNube : I_Archivo {
    override val tipoArchivo = "Archivo de nube"

    override fun setText(texto: String) {
        println("Escribiendo \"$texto\" en archivo de nube...")
    }

    override fun getText() = "Obteniendo texto del archivo de nube..."
}