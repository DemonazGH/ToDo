package com.example.todolist.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ToDoList::class],
    version = 1
)
abstract class ToDoDataBase(): RoomDatabase() {
    abstract val dao: ToDoListDao
}