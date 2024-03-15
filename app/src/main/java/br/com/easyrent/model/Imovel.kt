package br.com.easyrent.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "tb_imoveis")
data class Imovel(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val tipo: TipoImovel = TipoImovel.APARTAMENTO,

    val descricao: String = "",

    val proprietario: Pessoa,

    val endereco: Endereco = Endereco(),

    val valorAluguel: Double = 0.0,

    val galeriaFotos: String = "",

    val dataCadastro: Date,

    val status: String = ""
)

