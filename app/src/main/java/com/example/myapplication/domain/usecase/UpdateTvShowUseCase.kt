package com.example.myapplication.domain.usecase

import com.example.myapplication.data.model.tvshow.TvList
import com.example.myapplication.domain.repository.TvShowRepository

class UpdateTvShowUseCase(private val tvShowRepository: TvShowRepository)
{
    suspend fun updattvShow(): List<TvList>? =tvShowRepository.getTvShow()
}