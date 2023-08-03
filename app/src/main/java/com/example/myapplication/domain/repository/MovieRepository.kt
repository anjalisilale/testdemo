package com.example.myapplication.domain.repository

import com.example.myapplication.data.model.movie.Movies


interface MovieRepository
{
    suspend fun getMovies(): List<Movies>?
    suspend fun updateMovies(): List<Movies>?
}