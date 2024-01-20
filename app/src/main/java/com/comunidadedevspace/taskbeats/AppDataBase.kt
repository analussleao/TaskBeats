package com.comunidadedevspace.taskbeats
//acesso a tabela/BD pelo taskdao
import androidx.room.Database
import androidx.room.RoomDatabase
//É O QUE CRIA A BASE DE DADOS
@Database(entities = [Task::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}
