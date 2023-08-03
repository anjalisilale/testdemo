package com.example.myapplication.data.model.artist


import com.google.gson.annotations.SerializedName

data class ArtistList(
    @SerializedName("results")
    val people: List<Artist>?
)