package com.example.myapplication.domain.repository

import com.example.myapplication.data.model.tvshow.TvList

interface TvShowRepository
{
    suspend fun getTvShow():List<TvList>?
    suspend fun updateTvShow():List<TvList>?
}