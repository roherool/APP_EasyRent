package br.com.easyrent.screens

import androidx.compose.foundation.background
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.easyrent.ui.theme.Orangish

@Composable
fun NewPessoaScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Orangish)
        .padding(32.dp)
    ) {
        Text(
            text = "NOVA PESSOA",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Column {
            Spacer(modifier = Modifier.height(32.dp))
            Button(
                onClick = { navController.navigate("home") },
                colors = ButtonDefaults.buttonColors(Color.White),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "HOME", fontSize = 20.sp, color = Color.Blue)
            }
            Spacer(modifier = Modifier.height(32.dp))
            EnderecoScreen()
        }
    }
}