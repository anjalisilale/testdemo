package com.example.myapplication.data.repository

import com.example.myapplication.data.API.TmdbService
import com.example.myapplication.data.model.movie.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImpl(private val tmdbService: TmdbService,
private val apikey:String):MovieDataResource
{
    /*override suspend fun getMovies(): Response<MovieList> {
        return  tmdbService.getpopularMovie(apikey)
    }*/
    // here its a return data
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getpopularMovie(apikey)


}