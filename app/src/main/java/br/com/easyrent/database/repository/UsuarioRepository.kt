package br.com.easyrent.database.repository

import android.content.Context
import br.com.easyrent.database.ConexaoDb
import br.com.easyrent.model.Usuario

class UsuarioRepository(context: Context) {

    private val db = ConexaoDb.getDatabase(context).usuarioDao()

    fun salvar(usuario: Usuario): Long {
        return db.salvar(usuario)
    }

    fun atualizar(usuario: Usuario): Int {
        return db.atualizar(usuario)
    }

    fun excluir(usuario: Usuario): Int {
        return db.excluir(usuario)
    }

    fun listarUsuarios(): List<Usuario> {
        return db.listarUsuarios()
    }

    fun buscarUsuarioPorUsername(username: String): Usuario {
        return db.buscarUsuarioPorUsername(username)
    }

}