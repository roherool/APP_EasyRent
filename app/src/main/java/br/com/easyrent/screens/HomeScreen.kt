package br.com.easyrent.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
fun HomeScreen(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(32.dp)
    ) {
        Text(text = "Catálogo de Imóveis",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { navController.navigate("listPessoas") },
                colors = ButtonDefaults.buttonColors(Orangish),
                modifier = Modifier.size(width = 200.dp, height = 48.dp)
            ) {
                Text(text = "Pessoas", fontSize = 20.sp, color = Color.White)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { navController.navigate("listImoveis") },
                colors = ButtonDefaults.buttonColors(Orangish),
                modifier = Modifier.size(width = 200.dp, height = 48.dp)
            ) {
                Text(text = "Imóveis", fontSize = 20.sp, color = Color.White)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { navController.navigate("listContratos") },
                colors = ButtonDefaults.buttonColors(Orangish),
                modifier = Modifier.size(width = 200.dp, height = 48.dp)
            ) {
                Text(text = "Contratos", fontSize = 20.sp, color = Color.White)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { navController.navigate("auth") },
                colors = ButtonDefaults.buttonColors(Orangish),
                modifier = Modifier.size(width = 200.dp, height = 48.dp)
            ) {
                Text(text = "Sair", fontSize = 20.sp, color = Color.White)
            }
        }
    }
}