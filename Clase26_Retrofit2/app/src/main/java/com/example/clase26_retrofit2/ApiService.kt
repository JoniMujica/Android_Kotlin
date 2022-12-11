package com.example.clase26_retrofit2

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

//esto se utiliza para que indicar el metodo que retrofit va a usar el servicio
interface ApiService {
    @GET
    suspend fun getDogsByBreads(@Url url:String):Response<DogResponse>
}