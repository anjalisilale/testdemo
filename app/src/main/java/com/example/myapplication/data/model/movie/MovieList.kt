package com.example.myapplication.data.model.movie


import androidx.room.Entity
import com.google.gson.annotations.SerializedName


data class MovieList(
    @SerializedName("results")
    val movies: List<Movies>?
)
