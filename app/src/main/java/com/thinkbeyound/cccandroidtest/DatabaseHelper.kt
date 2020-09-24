package com.thinkbeyound.cccandroidtest

interface DatabaseHelper {

//    suspend fun getUsers(): List<User>

    suspend fun insertperson(users: person)

    suspend fun insertestimate(users: estimate)

}
