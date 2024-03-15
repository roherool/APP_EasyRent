package br.com.easyrent.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.easyrent.model.Pessoa

@Dao
interface PessoaDao {

    @Insert
    fun salvar(pessoa: Pessoa): Long

    @Update
    fun atualizar(pessoa: Pessoa): Int

    @Delete
    fun excluir(pessoa: Pessoa): Int

    @Query("SELECT * FROM tb_pessoas WHERE id = :id")
    fun buscarPessoaPeloId(id: Int): Pessoa

    @Query("SELECT * FROM tb_pessoas ORDER BY nome ASC")
    fun listarPessoas(): List<Pessoa>
}