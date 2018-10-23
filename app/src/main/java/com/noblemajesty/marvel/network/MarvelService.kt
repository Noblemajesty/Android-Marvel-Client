package com.noblemajesty.marvel.network

import com.noblemajesty.marvel.models.getCharacters.MarvelCharacters
import com.noblemajesty.marvel.models.getComics.MarvelComics
import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface MarvelService {
    @GET("/v1/public/characters")
    fun listCharacters(@QueryMap options: Map<String, String>): Flowable<MarvelCharacters>

    @GET("/v1/public/comics")
    fun listComics(): Flowable<MarvelComics>
}