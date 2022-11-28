package com.utn.kotlin.interfaces.implementaciones

import com.utn.kotlin.interfaces.I_Archivo

class ArchivoBinario : I_Archivo {
    override val tipoArchivo = "Archivo binario"

    override fun setText(texto: String) {
        println("Escribiendo \"$texto\" en archivo binario...")
    }

    override fun getText() = "Obteniendo texto del archivo binario..."
}