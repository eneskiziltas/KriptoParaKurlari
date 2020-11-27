package com.eneskiziltas.retrofitkotlin.service

import com.eneskiziltas.retrofitkotlin.model.CryptoModel
import io.reactivex.Observable

import retrofit2.http.GET
import java.util.*

interface CryptoAPI {

    //GET, POST, UPDATE, DELETE

    //https://api.nomics.com/v1/
    //prices?key=bfefbd711d01dbba9ca1eaa18007360e
    //bfefbd711d01dbba9ca1eaa18007360e

    @GET("prices?key=bfefbd711d01dbba9ca1eaa18007360e")
    fun getData(): Observable<List<CryptoModel>>

   // @GET("prices?key=bfefbd711d01dbba9ca1eaa18007360e")
 //   fun getData(): Observable<List<CryptoModel>>

    //fun getData():Call<List<CryptoModel>>

}