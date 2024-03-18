package br.com.easyrent.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.easyrent.R
import br.com.easyrent.components.CustomAppBar
import br.com.easyrent.database.repository.PessoaRepository
import br.com.easyrent.model.Pessoa
import br.com.easyrent.ui.theme.Orangish

@SuppressLint("ResourceAsColor")
@Composable
fun FormPessoaScreen(
    navController: NavHostController,
    tipo: String,
    nome: String,
    cpf: String,
    telefone: String,
    email: String,
    endereco: String,
    onTipoChange: (String) -> Unit,
    onNomeChange: (String) -> Unit,
    onCpfChange: (String) -> Unit,
    onTelefoneChange: (String) -> Unit,
    onEmailChange: (String) -> Unit,
    onEnderecoChange: (String) -> Unit,
    atualizar: () -> Unit
) {
    val context = LocalContext.current
    val pessoaRepository = PessoaRepository(context)

    Box(modifier = Modifier.fillMaxSize()) {
        CustomAppBar(
            currentScreen = "Novo Perfil",
            showBackButton = true,
            onBackButtonClick = { navController.navigate("home")},
        )
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(32.dp)
        ) {
            Text(
                text = "Proprietário",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(R.color.stormy_blue)
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = nome,
                onValueChange = { onNomeChange(it) },
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(20.dp),
                label = {
                    Text(text = "Nome")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    capitalization = KeyboardCapitalization.Words
                )
            )
            Row {
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = tipo,
                    onValueChange = { onTipoChange(it) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(20.dp),
                    label = {
                        Text(text = "Tipo")
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        capitalization = KeyboardCapitalization.Words
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = cpf,
                    onValueChange = { onCpfChange(it) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(20.dp),
                    label = {
                        Text(text = "CPF")
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                    )
                )
            }
            Text(
                text = "Contatos",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(R.color.stormy_blue)
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = email,
                onValueChange = { onEmailChange(it) },
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(20.dp),
                label = {
                    Text(text = "E-Mail")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email,
                )
            )
            OutlinedTextField(
                value = telefone,
                onValueChange = { onTelefoneChange(it) },
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(20.dp),
                label = {
                    Text(text = "Telefone")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                )
            )
            Text(
                text = "Endereço residencial",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(R.color.stormy_blue)
            )
            EnderecoScreen()
            Spacer(modifier = Modifier.height(32.dp))
            Row(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Button(
                    onClick = { navController.navigate("home") },
                    colors = ButtonDefaults.buttonColors(Orangish),
                ) {
                    Text(text = "Cancelar", fontSize = 20.sp, color = Color.White)
                }
                Button(
                    onClick = {
                        val pessoa = Pessoa(
                            id = 0,
                            nome = nome,
                            tipo = tipo,
                            cpf = cpf,
                            telefone = telefone,
                            email = email,
                            endereco = endereco,
                        )
                        pessoaRepository.salvar(pessoa)
                        atualizar()

                        navController.navigate("home")
                    },
                    colors = ButtonDefaults.buttonColors(Orangish),
                ) {
                    Text(text = "Salvar", fontSize = 20.sp, color = Color.White)
                }
            }

        }
    }
}