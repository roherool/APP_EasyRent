package br.com.easyrent.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.easyrent.model.Pessoa

@Composable
fun CardPessoa(pessoa: Pessoa) {

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 4.dp)
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
        ) {
            Text(text = "Nome: ${pessoa.nome}")
            Text(text = "Tipo: ${pessoa.tipo}")
            Text(text = "CPF: ${pessoa.cpf}")
            Text(text = "Código: ${pessoa.id}")
        }
    }
}