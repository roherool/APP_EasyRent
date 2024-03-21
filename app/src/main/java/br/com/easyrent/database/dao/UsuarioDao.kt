package br.com.easyrent.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.easyrent.model.Usuario

@Dao
interface UsuarioDao {

    @Insert
    fun salvar(usuario: Usuario): Long

    @Update
    fun atualizar(usuario: Usuario): Int

    @Delete
    fun excluir(usuario: Usuario): Int

    @Query("SELECT * FROM tb_usuarios WHERE username = username")
    fun buscarUsuarioPorUsername(username: String): Usuario

    @Query("SELECT * FROM tb_usuarios ORDER BY username ASC")
    fun listarUsuarios(): List<Usuario>

}