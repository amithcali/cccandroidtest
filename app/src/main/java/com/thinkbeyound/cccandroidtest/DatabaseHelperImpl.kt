package com.thinkbeyound.cccandroidtest


 class DatabaseHelperImpl(private val appDatabase: AppDatabase) : DatabaseHelper {





     override suspend fun insertperson(users: person)  = appDatabase.Dao().insertperson(users)

     override suspend fun insertestimate(users: estimate) = appDatabase.Dao().insertestimate(users)

//    override suspend fun insertperson(users: person): person = appDatabase.Dao().insertperson(users)
//     override suspend fun insertperson(users: person) {
//         TODO("Not yet implemented")
//     }
//
//     override suspend fun insertestimate(users: estimate): estimate = appDatabase.Dao().insertestimate(users)

//    override suspend fun insertAll(users: List<User>) = appDatabase.Dao().insertperson(users)

}