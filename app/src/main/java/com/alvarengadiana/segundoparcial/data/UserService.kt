package com.alvarengadiana.segundoparcial.data

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface UserService {
    @GET("usuarios/")
    fun getUsers(): Call<List<User>>

    @POST("usuarios/")
    fun createUser(@Body user: User): Call<User>
}
