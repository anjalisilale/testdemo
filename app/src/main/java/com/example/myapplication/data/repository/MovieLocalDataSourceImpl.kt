package com.example.myapplication.data.repository

import com.example.myapplication.data.db.MovieDAO
import com.example.myapplication.data.model.movie.Movies
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// here its connect with dao class
// so we add constructor parameter

class MovieLocalDataSourceImpl(private val movieDao:MovieDAO): MovieLocalDataSource
{
    // get data from room it run in background
    // but for other we need to call that in background threadso we add coroutine
    override suspend fun getMovieFromDB(): List<Movies>
    {
      return movieDao.getMovieList()
    }

    override suspend fun savemoviesformDB(movies: List<Movies>)
    {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.deleteallmovies()
        }
    }
}