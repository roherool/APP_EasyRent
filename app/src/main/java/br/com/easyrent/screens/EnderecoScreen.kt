package br.com.easyrent.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun EnderecoScreen() {
    var cepState by remember { mutableStateOf("") }
    var ruaState by remember { mutableStateOf("") }
    var numeroState by remember { mutableStateOf("") }
    var complementoState by remember { mutableStateOf("") }
    var bairroState by remember { mutableStateOf("") }
    var cidadeState by remember { mutableStateOf("") }
    var ufState by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Row {
                OutlinedTextField(
                    value = cepState,
                    onValueChange = {
                        cepState = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f)
                        .padding(end = 6.dp),
                    label = {
                        Text(text = "Cep")
                    },
                    trailingIcon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = ""
                            )
                        }
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    )
                )
                OutlinedTextField(
                    value = "nome"/*selectedNames.joinToString { "" }*/,
                    onValueChange = { /*TODO*/ /*onTipoChange(it)*/ },
                    label = {
                        Text(text = "Tipo")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f)
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            OutlinedTextField(
                value = ruaState,
                onValueChange = {
                    ruaState = it
                },
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Rua")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                OutlinedTextField(
                    value = numeroState,
                    onValueChange = {
                        numeroState = it
                    },
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 6.dp),
                    label = {
                        Text(text = "Número")
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        capitalization = KeyboardCapitalization.Words
                    )
                )
                OutlinedTextField(
                    value = complementoState,
                    onValueChange = {
                        complementoState = it
                    },
                    modifier = Modifier.weight(2f),
                    label = {
                        Text(text = "Complemento")
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        capitalization = KeyboardCapitalization.Words
                    )
                )
//                IconButton(onClick = {
//                    val call = EnderecoFactory().getCepService().getEnderecosByUfCidade(
//                        uf = ufState,
//                        cidade = cidadeState,
//                        rua = ruaState
//                    )
//                    call.enqueue(object : Callback<List<Endereco>> {
//                        override fun onResponse(
//                            call: Call<List<Endereco>>,
//                            response: Response<List<Endereco>>
//                        ) {
//                            // Log.i("FIAP", "onResponse: ${response.body()}")
//                            listaCepsState = response.body()!!
//                        }
//
//                        override fun onFailure(call: Call<List<Endereco>>, t: Throwable) {
//                            // Log.i("FIAP", "onResponse: ${t.message}")
//                        }
//
//                    })
//                }) {
//                    Icon(imageVector = Icons.Default.Search, contentDescription = "")
//                }
            }
            Spacer(modifier = Modifier.height(4.dp))
            OutlinedTextField(
                value = bairroState,
                onValueChange = {
                    bairroState = it
                },
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Bairro")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row {
                OutlinedTextField(
                    value = ufState,
                    onValueChange = {
                        ufState = it
                    },
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 6.dp),
                    label = {
                        Text(text = "UF")
                    },
                    keyboardOptions = KeyboardOptions(
                        capitalization = KeyboardCapitalization.Characters,
                        keyboardType = KeyboardType.Text
                    )
                )
                OutlinedTextField(
                    value = cidadeState,
                    onValueChange = {
                        cidadeState = it
                    },
                    modifier = Modifier.weight(2f),
                    label = {
                        Text(text = "Cidade")
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        capitalization = KeyboardCapitalization.Words
                    )
                )
            }
        }
    }
}