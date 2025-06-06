package com.yyy.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yyy.data.local.dao.FavoriteMovieDao
import com.yyy.data.local.dao.SearchHistoryDao
import com.yyy.data.local.entity.FavoriteMovieEntity
import com.yyy.data.local.entity.SearchHistoryEntity

@Database(
    entities = [
        SearchHistoryEntity::class,
        FavoriteMovieEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun searchHistoryDao(): SearchHistoryDao
    abstract fun favoriteMovieDao(): FavoriteMovieDao
} 