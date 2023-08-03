package com.example.myapplication.domain.repository

import com.example.myapplication.data.model.artist.Artist
import com.example.myapplication.data.model.artist.ArtistList

interface ArtiestRepository
{
    suspend fun getArtist(): List<Artist>?
    suspend fun updatelist(): List<Artist>?
}