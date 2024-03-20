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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.easyrent.R
import br.com.easyrent.components.CustomAppBar
import br.com.easyrent.ui.theme.Orangish

@SuppressLint("ResourceAsColor")
@Composable
fun ImovelScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomAppBar(
            currentScreen = "Novo Imóvel",
            showBackButton = true,
            onBackButtonClick = { navController.navigate("home")},
        )
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
        ) {
            Text(
                text = "Dados do Imóvel",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(R.color.stormy_blue)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row {
                OutlinedTextField(
                    value = "tipo"/*selectedNames.joinToString { "" }*/,
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
                    value = "finalidade",
                    onValueChange = { /*TODO*/  /*onCpfChange(it)*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f),
                    label = {
                        Text(text = "Finalidade")
                    },
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            OutlinedTextField(
                value = "descricao",
                onValueChange = { /*TODO*/ /*onNomeChange(it)*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(20.dp),
                label = {
                    Text(text = "Descrição")
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
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                OutlinedTextField(
                    value = "valor"/*selectedNames.joinToString { "" }*/,
                    onValueChange = { /*TODO*/ /*onTipoChange(it)*/ },
                    label = {
                        Text(text = "Valor")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f)
                        .padding(end = 6.dp)
                )
                ElevatedCard(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f)
                        .size(width = 12.dp, height = 50.dp),


                ) {
                    Icon(
                        imageVector = Icons.Filled.AddCircle,
                        tint = colorResource(R.color.orangish),
                        contentDescription = null
                    )
                    Text(text = "Imagens",
                        fontSize = (24.sp),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Endereço",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(R.color.stormy_blue)
            )
            EnderecoScreen()
            Spacer(modifier = Modifier.height(24.dp))
            Row(modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.End)
                .padding(8.dp)
            ) {
                Button(
                    onClick = { navController.navigate("home") },
                    colors = ButtonDefaults.buttonColors(Orangish),
                ) {
                    Text(text = "Salvar", fontSize = 20.sp, color = Color.White)
                }
            }
        }
    }
}