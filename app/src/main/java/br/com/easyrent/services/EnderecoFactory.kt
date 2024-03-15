package br.com.easyrent.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class EnderecoFactory {

    private val URL = "https://viacep.com.br/ws/"

    private val enderecoFactory = Retrofit
        .Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getCepService(): EnderecoService {
        return enderecoFactory.create(EnderecoService::class.java)
    }

}