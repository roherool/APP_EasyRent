package br.com.easyrent.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "tb_pessoas")
data class Pessoa(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val nome: String = "",

    val cpf: String = "",

    val tipo: TipoPessoa = TipoPessoa.PERFIL,

    val telefone: String = "",

    val email: String = "",

    val endereco: Endereco = Endereco(),

    val dataCadastro: LocalDate
)