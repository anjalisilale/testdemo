package com.example.myapplication.domain.usecase

import com.example.myapplication.data.model.movie.Movies
import com.example.myapplication.domain.repository.MovieRepository

class GetMovieUseCase(private val movieRepository: MovieRepository)
{
    suspend fun execute():List<Movies>? = movieRepository.getMovies()

}