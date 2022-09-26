package com.example.todolist.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ToDoListDao {

    @Insert(onConflict = REPLACE)
    suspend fun insertItem(item: ToDoList)

    @Delete
    suspend fun deleteItem(item: ToDoList)

    @Query("SELECT * FROM ToDoList WHERE id = :id")
    suspend fun getItemById(id: Int)

    @Query("SELECT * FROM ToDoList")
    fun getToDoItems(): Flow<List<ToDoList>>

}