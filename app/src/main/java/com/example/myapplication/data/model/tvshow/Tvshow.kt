package com.example.myapplication.data.model.tvshow


import com.google.gson.annotations.SerializedName

data class Tvshow(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val tvLists: List<TvList>?,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)