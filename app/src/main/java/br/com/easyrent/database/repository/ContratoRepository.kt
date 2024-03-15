package br.com.easyrent.database.repository

import android.content.Context
import br.com.easyrent.database.ConexaoDb
import br.com.easyrent.model.Contrato

class ContratoRepository(context: Context) {

    private val db = ConexaoDb.getDatabase(context).contratoDao()

    fun salvar(contrato: Contrato): Long {
        return db.salvar(contrato)
    }

    fun atualizar(contrato: Contrato): Int {
        return db.atualizar(contrato)
    }

    fun excluir(contrato: Contrato): Int {
        return db.excluir(contrato)
    }

    fun listarContratos(): List<Contrato> {
        return db.listarContratos()
    }

    fun buscarContatoPeloId(id: Int): Contrato {
        return db.buscarContratoPeloId(id)
    }
}