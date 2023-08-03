package com.example.myapplication.data.repository

import com.example.myapplication.data.model.movie.Movies


// this it use because if use want to list again insert of call from DB or api we using this for cache data
class MovieCashDataSourceImpl:MovieCachedataSource
{

    override suspend fun getMoviesFromCache(): List<Movies> {
        TODO("Not yet implemented")
    }

    override suspend fun saveMovieToCache(movies: List<Movies>) {
        TODO("Not yet implemented")
    }
}