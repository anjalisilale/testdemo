package com.example.myapplication.data.repository

import com.example.myapplication.data.model.movie.Movies
import com.example.myapplication.domain.repository.MovieRepository

class MovieRepositoryImpl: MovieRepository
{
    override suspend fun getMovies(): List<Movies>? {
        TODO("Not yet implemented")
    }

    override suspend fun updateMovies(): List<Movies>? {
        TODO("Not yet implemented")
    }
}