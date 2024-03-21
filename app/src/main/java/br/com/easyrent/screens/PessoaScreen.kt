package br.com.easyrent.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.easyrent.R
import br.com.easyrent.components.CustomAppBar
import br.com.easyrent.ui.theme.Orangish

@SuppressLint("ResourceAsColor")
@Composable
fun PessoaScreen(
    navController: NavHostController,
//    tipos: List<String>,
//    nome: String,
//    cpf: String,
//    telefone: String,
//    email: String,
//    endereco: String,
//    onTipoChange: (String) -> Unit,
//    onNomeChange: (String) -> Unit,
//    onCpfChange: (String) -> Unit,
//    onTelefoneChange: (String) -> Unit,
//    onEmailChange: (String) -> Unit,
//    onEnderecoChange: (String) -> Unit,
//    atualizar: () -> Unit
) {
//    val context = LocalContext.current
//    val pessoaRepository = PessoaRepository(context)

//    fun saveNewPerson() {
//        val pessoa = Pessoa(
//            id = 0,
//            nome = "nome",
//            tipo = TipoPessoa.PERFIL,
//            cpf = "cpf",
//            telefone = "telefone",
//            email = "email",
//            endereco = Endereco(),
//            dataCadastro = LocalDate.now()
//        )
//        pessoaRepository.salvar(pessoa)
//    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomAppBar(
            currentScreen = "Novo Perfil",
            showBackButton = true,
            onBackButtonClick = { navController.navigate("home")},
        )
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
        ) {
            Text(
                text = "Dados Pessoais",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(R.color.stormy_blue)
            )
            Spacer(modifier = Modifier.height(4.dp))
            OutlinedTextField(
                value = "nome",
                onValueChange = { /*TODO*/ /*onNomeChange(it)*/ },
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
            Spacer(modifier = Modifier.height(4.dp))
            Row {
                OutlinedTextField(
                    value = "nome"/*selectedNames.joinToString { "" }*/,
                    onValueChange = { /*TODO*/ /*onTipoChange(it)*/ },
                    label = {
                        Text(text = "Tipo")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f)
                        .padding(end = 6.dp)
                )
                OutlinedTextField(
                    value = "cpf",
                    onValueChange = { /*TODO*/  /*onCpfChange(it)*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f),
                    label = {
                        Text(text = "Cpf")
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                    )
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Contatos",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(R.color.stormy_blue)
            )
            Spacer(modifier = Modifier.height(4.dp))
            OutlinedTextField(
                value = "email",
                onValueChange = { /*TODO*/  /*onEmailChange(it)*/ },
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
            Spacer(modifier = Modifier.height(4.dp))
            OutlinedTextField(
                value = "telefone",
                onValueChange = { /*TODO*/  /*onTelefoneChange(it)*/ },
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
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Endereço",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(R.color.stormy_blue)
            )
            EnderecoScreen()
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
            ) {
                Button(
                    onClick = { navController.navigate("home") },
                    colors = ButtonDefaults.buttonColors(Color.Gray),
                    modifier = Modifier
                        .height(55.dp)
                        .weight(2f)
                        .padding(end = 12.dp),
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Text(text = "Cancelar", fontSize = 20.sp, color = Color.White)
                }
                Button(
                    onClick = {
//                        saveNewPerson()
                        /*atualizar()*/
                        navController.navigate("home")
                    },
                    colors = ButtonDefaults.buttonColors(Orangish),
                    modifier = Modifier
                        .height(55.dp)
                        .weight(2f),
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Text(text = "Salvar", fontSize = 20.sp, color = Color.White)
                }
            }
        }
    }
}