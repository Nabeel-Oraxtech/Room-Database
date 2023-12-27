package com.example.roomdemo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Employee-Table")
data class EmployeeEntity(
    @PrimaryKey (autoGenerate = true)
    var id:Int=0,
    var name:String="",
    var email:String=""
)
