package com.example.myapplication.data.repository

import com.example.myapplication.data.model.movie.Movies

interface MovieCachedataSource
{

    suspend fun getMoviesFromCache():List<Movies>
    suspend fun saveMovieToCache(movies: List<Movies>)

}