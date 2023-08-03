package com.example.myapplication.data.repository

import com.example.myapplication.data.model.movie.MovieList
import retrofit2.Response

interface MovieDataResource
{
    // here Response<MovieList> this return is same as in our api return list
    suspend fun getMovies(): Response<MovieList>
}