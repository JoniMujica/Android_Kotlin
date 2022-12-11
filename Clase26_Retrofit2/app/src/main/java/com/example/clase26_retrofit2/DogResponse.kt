package com.example.clase26_retrofit2

import com.google.gson.annotations.SerializedName

data class DogResponse(
    @SerializedName("message") var images:List<String>,
    var status:String)
     //es obligatorio que los nombres de los parametros sean iguales que los nombres de los campos del json para obtener la informacion

