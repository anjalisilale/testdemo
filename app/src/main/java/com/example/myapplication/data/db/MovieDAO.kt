package com.example.myapplication.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myapplication.data.model.artist.Artist
import com.example.myapplication.data.model.movie.Movies
import com.example.myapplication.data.model.tvshow.TvList


@Dao
interface MovieDAO
{
    // check about this
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(movies: List<Movies>)

    @Query("DELETE FROM populer_movie")
    suspend fun deleteallmovies()

    @Query("SELECT * FROM populer_movie")
    suspend fun getMovieList(): List<Movies>

}