package com.example.myapplication.domain.usecase

import com.example.myapplication.data.model.artist.Artist
import com.example.myapplication.domain.repository.ArtiestRepository

class UpdateArtiestUseCase(private val artiestRepository: ArtiestRepository)
{
    suspend fun updateArtiest():List<Artist>? = artiestRepository.getArtist()
}