package br.com.easyrent.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.easyrent.model.Imovel

@Dao
interface ImovelDao {

    @Insert
    fun salvar(imovel: Imovel): Long

    @Update
    fun atualizar(imovel: Imovel): Int

    @Delete
    fun excluir(imovel: Imovel): Int

    @Query("SELECT * FROM tb_imoveis WHERE id = :id")
    fun buscarImovelPeloId(id: Int): Imovel

    @Query("SELECT * FROM tb_imoveis ORDER BY descricao ASC")
    fun listarImoveis(): List<Imovel>
}