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
import androidx.navigation.NavController
import br.com.easyrent.R
import br.com.easyrent.components.CustomAppBar
import br.com.easyrent.ui.theme.Orangish

@SuppressLint("ResourceAsColor")
@Composable
fun ContratoScreen(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomAppBar(
            currentScreen = "Contrato",
            showBackButton = true,
            onBackButtonClick = { navController.navigate("home")},
        )
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
        ) {
            Text(
                text = "Partes Interessadas",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(R.color.stormy_blue)
            )
            Spacer(modifier = Modifier.height(4.dp))
            OutlinedTextField(
                value = "locatario",
                onValueChange = { /*TODO*/ /*onNomeChange(it)*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(20.dp),
                label = {
                    Text(text = "Locatário")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    capitalization = KeyboardCapitalization.Words
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            OutlinedTextField(
                value = "proprietario",
                onValueChange = { /*TODO*/ /*onNomeChange(it)*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(20.dp),
                label = {
                    Text(text = "Proprietário")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    capitalization = KeyboardCapitalization.Words
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Objeto do Contrato",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(R.color.stormy_blue)
            )
            Spacer(modifier = Modifier.height(4.dp))
            OutlinedTextField(
                value = "Imóvel",
                onValueChange = { /*TODO*/ /*onNomeChange(it)*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(20.dp),
                label = {
                    Text(text = "Imóvel")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    capitalization = KeyboardCapitalization.Words
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                OutlinedTextField(
                    value = "valor"/*selectedNames.joinToString { "" }*/,
                    onValueChange = { /*TODO*/ /*onTipoChange(it)*/ },
                    label = {
                        Text(text = "Valor do Contrato")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f)
                        .padding(end = 6.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                    )
                )
                OutlinedTextField(
                    value = "duracao"/*selectedNames.joinToString { "" }*/,
                    onValueChange = { /*TODO*/ /*onTipoChange(it)*/ },
                    label = {
                        Text(text = "Tempo em Meses")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                    )
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Garantias",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(R.color.stormy_blue)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                OutlinedTextField(
                    value = "tipo"/*selectedNames.joinToString { "" }*/,
                    onValueChange = { /*TODO*/ /*onTipoChange(it)*/ },
                    label = {
                        Text(text = "Tipo")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f)
                        .padding(end = 6.dp),
                )
                OutlinedTextField(
                    value = "valor"/*selectedNames.joinToString { "" }*/,
                    onValueChange = { /*TODO*/ /*onTipoChange(it)*/ },
                    label = {
                        Text(text = "Valor da Garantia")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                    )
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            OutlinedTextField(
                value = "fiador",
                onValueChange = { /*TODO*/ /*onNomeChange(it)*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(20.dp),
                label = {
                    Text(text = "Fiador")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    capitalization = KeyboardCapitalization.Words
                )
            )
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
                    Text(text = "Desistir", fontSize = 20.sp, color = Color.White)
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
                    Text(text = "Assinar", fontSize = 20.sp, color = Color.White)
                }
            }
        }
    }
}