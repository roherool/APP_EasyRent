package br.com.easyrent.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.easyrent.R
import br.com.easyrent.model.Usuario

@Composable
fun AuthScreen(
    navController: NavHostController,
    onEnterClick: (Usuario) -> Unit
) {
    var userName by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_logo_2x),
            contentDescription = "Imagem de login",
            modifier = Modifier.size(100.dp)
        )
        Text(
            text = "Login do Usuário",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.orangish)
        )
        Spacer(modifier = Modifier.height(24.dp))
        OutlinedTextField(
            value = userName,
            onValueChange = {newValue -> userName = newValue },
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            label = {
                Text(text = "Usuário")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Usuário do sistema",
                    tint = (colorResource(id = R.color.orangish))
                )
            }
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it},
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            label = {
                Text(text = "Senha")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Senha do usuário",
                    tint = (colorResource(id = R.color.orangish))
                )
            }
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(
            onClick = {
                onEnterClick(
                    Usuario(
                        userName,
                        password
                    )
                )
                navController.navigate("home") },
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(60.dp),
            shape = RoundedCornerShape(4.dp)
        ) {
            Text(
                text = "Entrar",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
        ) {
            HorizontalDivider(color = colorResource(id = R.color.orangish))
        }

    }
}