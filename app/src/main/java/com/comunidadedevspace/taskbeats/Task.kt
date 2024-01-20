package com.comunidadedevspace.taskbeats
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
//CLASSE QUE ESTA DENTRO DA BASE DE DADOS == ENTITY// segura os dados para transicionar entre os lados
@Entity
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Int=0,
    val title: String,
    val description: String
    ): Serializable
