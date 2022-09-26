package com.example.todolist.database.datarepo

import com.example.todolist.database.ToDoList
import kotlinx.coroutines.flow.Flow

interface DataRepository {

    suspend fun insertItem(item: ToDoList)

    suspend fun deleteItem(item: ToDoList)

    suspend fun getItemById(id: Int)

    fun getToDoItems(): Flow<List<ToDoList>>

}