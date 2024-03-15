package br.com.easyrent.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "tb_pessoas")
data class Pessoa(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val nome: String = "",

    val cpf: String = "",

    val tipo: String = "",

    val endereco: Endereco = Endereco(),

    val dataCadastro: Date
)