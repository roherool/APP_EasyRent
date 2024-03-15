package br.com.easyrent.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.easyrent.model.Contrato

@Dao
interface ContratoDao {

    @Insert
    fun salvar(contrato: Contrato): Long

    @Update
    fun atualizar(contrato: Contrato): Int

    @Delete
    fun excluir(contrato: Contrato): Int

    @Query("SELECT * FROM tb_contratos WHERE numero = :numero")
    fun buscarContratoPeloId(numero: Int): Contrato

    @Query("SELECT * FROM tb_contratos ORDER BY locatario ASC")
    fun listarContratos(): List<Contrato>
}