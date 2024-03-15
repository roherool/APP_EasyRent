package br.com.easyrent.database.repository

import android.content.Context
import br.com.easyrent.database.ConexaoDb
import br.com.easyrent.model.Pessoa

class PessoaRepository(context: Context) {

    private val db = ConexaoDb.getDatabase(context).pessoaDao()

    fun salvar(pessoa: Pessoa): Long {
        return db.salvar(pessoa)
    }

    fun atualizar(pessoa: Pessoa): Int {
        return db.atualizar(pessoa)
    }

    fun excluir(pessoa: Pessoa): Int {
        return db.excluir(pessoa)
    }

    fun listarPessoas(): List<Pessoa> {
        return db.listarPessoas()
    }

    fun buscarPessoaPeloId(id: Int): Pessoa {
        return db.buscarPessoaPeloId(id)
    }
}