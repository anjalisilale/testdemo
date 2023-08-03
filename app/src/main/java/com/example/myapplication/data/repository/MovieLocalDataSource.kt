package com.example.myapplication.data.repository

import com.example.myapplication.data.model.movie.Movies

interface MovieLocalDataSource
{
    suspend fun getMovieFromDB():List<Movies>
    suspend fun savemoviesformDB(movies: List<Movies>)
    suspend fun clearAll()

}