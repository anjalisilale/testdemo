package com.example.myapplication.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myapplication.data.model.tvshow.TvList


@Dao
interface TvShowDAO
{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTvList(tvList: TvList)

    @Query("DELETE FROM popular_tvlist")
    suspend fun deleteTvList()

    @Query("SELECT * FROM popular_tvlist")
    suspend fun getAllTvList():List<TvList>
}