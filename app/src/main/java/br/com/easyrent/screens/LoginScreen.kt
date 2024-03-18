package br.com.easyrent.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.navigation.NavController
import br.com.easyrent.ui.theme.Orangish

@Composable
fun LoginScreen(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(32.dp)
    ) {
        Text(text = "Login",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray
        )
        Button(
            onClick = { navController.navigate("home") },
            colors = ButtonDefaults.buttonColors(Orangish),
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(text = "Entrar", fontSize = 20.sp, color = Color.White)
        }
    }
}