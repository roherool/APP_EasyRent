package br.com.easyrent.database.repository

import android.content.Context
import br.com.easyrent.database.ConexaoDb
import br.com.easyrent.model.Imovel

class ImovelRepository(context: Context) {

    private val db = ConexaoDb.getDatabase(context).imovelDao()

    fun salvar(imovel: Imovel): Long {
        return db.salvar(imovel)
    }

    fun atualizar(imovel: Imovel): Int {
        return db.atualizar(imovel)
    }

    fun excluir(imovel: Imovel): Int {
        return db.excluir(imovel)
    }

    fun listarImoveis(): List<Imovel> {
        return db.listarImoveis()
    }

    fun buscarImovelPeloId(id: Int): Imovel {
        return db.buscarImovelPeloId(id)
    }
}