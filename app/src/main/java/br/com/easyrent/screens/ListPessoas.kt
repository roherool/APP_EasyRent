package br.com.easyrent.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.easyrent.components.CustomAppBar
import br.com.easyrent.ui.theme.Orangish

@Composable
fun ListPessoas(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        CustomAppBar(
            currentScreen = "Lista de Pessoas",
            showBackButton = true,
            onBackButtonClick = { navController.navigate("home")},
        )
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(32.dp)
        ) {
            Spacer(modifier = Modifier.height(32.dp))
            Button(
                onClick = { navController.navigate("newPessoa") },
                colors = ButtonDefaults.buttonColors(Orangish),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "Incluir Pessoa", fontSize = 20.sp, color = Color.White)
            }
        }
    }
}