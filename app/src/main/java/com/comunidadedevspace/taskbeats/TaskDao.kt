package com.comunidadedevspace.taskbeats
//DAO É A DATA ACCESS OBJECT, ACESSA OS DADOS
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

//Dao vai acessar o BD
@Dao
interface TaskDao {
    //mudar a tarefa para uma mais atual
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(task: Task)
        //fazer busca dentro da base de dados=== read do crud
    @Query("Select * from task")
    fun getAll(): List<Task>

    //para fazer o update é preciso encontrar a tarefa em caso de conflito que quer alterar

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update (task: Task)

    //delete todos
    @Query("DELETE from task")
    fun deleteAll()

    //delete pelo id
    @Query("DELETE from task WHERE id =:id")
    fun deleteById(id: Int)

}