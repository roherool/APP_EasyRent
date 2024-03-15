package br.com.easyrent.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.easyrent.model.Endereco

@Composable
fun CardEndereco(endereco: Endereco) {

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 4.dp)
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
        ) {
            Text(text = "CEP: ${endereco.cep}")
            Text(text = "Rua: ${endereco.rua}")
            Text(text = "Número: ${endereco.numero}")
            Text(text = ": ${endereco.complemento}")
            Text(text = "Bairro: ${endereco.bairro}")
            Text(text = "Cidade: ${endereco.cidade}")
            Text(text = "UF: ${endereco.uf}")
        }
    }

}