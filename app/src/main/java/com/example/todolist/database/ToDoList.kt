package com.example.todolist.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ToDoList(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val description: String,
    val isDone: Boolean
)