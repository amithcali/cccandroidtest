package com.thinkbeyound.cccandroidtest

import Json4Kotlin_Base
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Dao



@Dao
interface Dao {

//    @Query("SELECT * FROM user")
//    suspend fun getAll(): List<Json4Kotlin_Base>

    @Insert
    suspend fun insertperson(users: person)

    @Insert
    suspend fun insertestimate(users: estimate)



}