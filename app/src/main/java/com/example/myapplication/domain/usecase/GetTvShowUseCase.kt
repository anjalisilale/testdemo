package com.example.myapplication.domain.usecase

import com.example.myapplication.data.model.tvshow.TvList
import com.example.myapplication.domain.repository.TvShowRepository

class GetTvShowUseCase(private val tvShowRepository: TvShowRepository)
{
    suspend fun getTvShowList():List<TvList>? = tvShowRepository.getTvShow()
}