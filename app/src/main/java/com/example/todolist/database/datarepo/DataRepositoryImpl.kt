package com.example.todolist.database.datarepo

import com.example.todolist.database.ToDoList
import com.example.todolist.database.ToDoListDao
import kotlinx.coroutines.flow.Flow

class DataRepositoryImpl(
    private val dao: ToDoListDao
): DataRepository {
    override suspend fun insertItem(item: ToDoList) {
        dao.insertItem(item)
    }

    override suspend fun deleteItem(item: ToDoList) {
        dao.deleteItem(item)
    }

    override suspend fun getItemById(id: Int) {
        return dao.getItemById(id)
    }

    override fun getToDoItems(): Flow<List<ToDoList>> {
        return dao.getToDoItems()
    }
}