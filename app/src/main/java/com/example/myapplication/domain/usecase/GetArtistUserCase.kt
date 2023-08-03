package com.example.myapplication.domain.usecase

import com.example.myapplication.data.model.artist.Artist
import com.example.myapplication.domain.repository.ArtiestRepository

class GetArtistUserCase(private val artiestRepository: ArtiestRepository)
{
    suspend fun getArtist():List<Artist>? = artiestRepository.getArtist()
}