package com.example.myapplication.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myapplication.data.model.artist.Artist


@Dao
interface ArtiestDAO
{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArtist(artist: Artist)

    @Query("DELETE FROM popular_artists")
    suspend fun getdeleteArtistList()

    @Query("SELECT * FROM popular_artists")
    suspend fun getArtiestlist(): List<Artist>
}