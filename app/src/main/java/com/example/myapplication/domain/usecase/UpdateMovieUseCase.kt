package com.example.myapplication.domain.usecase

import com.example.myapplication.data.model.movie.Movies

class UpdateMovieUseCase(private val updateMovieUseCase: UpdateMovieUseCase)
{
    suspend fun updatemovie():List<Movies>? =updateMovieUseCase.updatemovie()

}