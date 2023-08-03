package com.example.myapplication.data.API

import com.example.myapplication.data.model.movie.MovieList
import com.example.myapplication.data.model.artist.ArtistList
import com.example.myapplication.data.model.tvshow.Tvshow
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TmdbService
{
    @GET("movie/popular")
    suspend fun getpopularMovie(@Query("api_key") apikey:String): Response<MovieList>

    @GET("tv/popular")
    suspend fun getpopularTvShow(@Query("api_key") apikey:String): Response<Tvshow>

    @GET("person/popular")
    suspend fun getpopularPserson(@Query("api_key") apikey:String): Response<ArtistList>

}
