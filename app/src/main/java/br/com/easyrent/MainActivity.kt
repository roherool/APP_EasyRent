package br.com.easyrent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.easyrent.screens.FormContratoScreen
import br.com.easyrent.screens.FormImovelScreen
import br.com.easyrent.screens.FormPessoaScreen
import br.com.easyrent.screens.HomeScreen
import br.com.easyrent.screens.ListContratos
import br.com.easyrent.screens.ListImoveis
import br.com.easyrent.screens.ListPessoas
import br.com.easyrent.screens.LoginScreen
import br.com.easyrent.ui.theme.EasyRentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EasyRentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "home"
                    ) {
                        composable(route = "login"){ LoginScreen(navController) }
                        composable(route = "home"){ HomeScreen(navController) }
                        composable(route = "newPessoa"){ FormPessoaScreen(navController) }
                        composable(route = "newImovel"){ FormImovelScreen(navController) }
                        composable(route = "newContrato"){ FormContratoScreen(navController) }
                        composable(route = "listPessoas"){ ListPessoas(navController) }
                        composable(route = "listImoveis"){ ListImoveis(navController ) }
                        composable(route = "listContratos"){ ListContratos(navController ) }
                    }
                }
            }
        }
    }
}