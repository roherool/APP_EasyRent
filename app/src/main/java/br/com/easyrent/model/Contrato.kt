package br.com.easyrent.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "tb_contratos")
data class Contrato(
    @PrimaryKey(autoGenerate = true)
    val numero: Long = 0,

    val tipo: TipoPessoa = TipoPessoa.PROPRIETARIO,

    val proprietario: Pessoa,

    val locatario: Pessoa,

    val imovel: Imovel,

    val valorAluguel: Double = 0.0,

    val dataEmissao: Date,

    val dataVencimento: Date,

    val status: String = ""
)

