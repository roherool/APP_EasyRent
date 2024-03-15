package br.com.easyrent.model

import com.google.gson.annotations.SerializedName

data class Endereco(
    val cep: String = "",

    @SerializedName("logradouro")
    val rua: String = "",

    val complemento: String = "",

    val numero: String = "",

    val bairro: String = "",

    @SerializedName("localidade")
    val cidade: String = "",

    val uf: String = ""
)
