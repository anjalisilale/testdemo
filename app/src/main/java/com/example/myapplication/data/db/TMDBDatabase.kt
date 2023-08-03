package com.example.myapplication.data.db

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [MovieDAO::class, ArtiestDAO::class, TvShowDAO::class], version = 1, exportSchema = false)
abstract class TMDBDatabase :RoomDatabase()
{
    abstract fun movieDAO(): MovieDAO

    abstract fun tvshowDAO(): TvShowDAO

    abstract fun aritestDAO(): ArtiestDAO

}