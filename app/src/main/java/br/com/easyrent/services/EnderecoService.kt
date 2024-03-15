package br.com.easyrent.services

import br.com.easyrent.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoService {

    //https://viacep.com.br/ws/01001000/json/
    @GET("{cep}/json")
    fun getEnderecoByCep(@Path("cep") cep: String): Call<Endereco>

    //https://viacep.com.br/ws/RS/Porto%Alegre/Domingos/json/
    @GET("{uf}/{cidade}/{rua}/json")
    fun getEnderecosByUfCidade(
        @Path("uf") uf: String,
        @Path("cidade") cidade: String,
        @Path("rua") rua: String
    ): Call<List<Endereco>>
}