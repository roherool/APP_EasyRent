package br.com.easyrent.model

import androidx.room.Entity

@Entity(tableName = "tb_usuarios")
data class Usuario(

    val username: String,
    val password: String,
)
