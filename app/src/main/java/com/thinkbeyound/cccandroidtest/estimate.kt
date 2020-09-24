package com.thinkbeyound.cccandroidtest



import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity

data class estimate(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "company") val company: String?,
    @ColumnInfo(name = "address") val address: String?,
    @ColumnInfo(name = "number") val number: Int?,
    @ColumnInfo(name = "revision_number") val revisionNumber: Int?,
    @ColumnInfo(name = "created_date") val createdDate: String?,
    @ColumnInfo(name = "created_by") val createdBy: String?,
    @ColumnInfo(name = "requested_by") val requestedBy: String?,
    @ColumnInfo(name = "contact") val contact: String?


)