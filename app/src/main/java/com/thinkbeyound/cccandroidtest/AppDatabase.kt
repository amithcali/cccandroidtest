package com.thinkbeyound.cccandroidtest

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [person::class,estimate::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun Dao(): Dao

}