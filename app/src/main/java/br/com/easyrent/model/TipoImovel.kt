package br.com.easyrent.model

enum class TipoImovel(val tipo: String, val sigla: String) {

    APARTAMENTO("Apartamento", "AP"),
    APARTAMENTO_GARDEN("Apartamento Garden", "AG"),
    APARTAMENTO_DUPLEX("Apartamento Duplex", "AD"),
    APARTAMENTO_COBERTURA("Apartamento Cobertura", "AC"),
    CASA("Casa", "CA"),
    CASA_SOBRADO("Casa Sobrado", "CS")
}