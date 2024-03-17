package br.com.easyrent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import br.com.easyrent.screens.HomeScreen
import br.com.easyrent.screens.ListagemContratos
import br.com.easyrent.screens.ListagemImoveis
import br.com.easyrent.screens.ListagemPessoas
import br.com.easyrent.screens.LoginScreen
import br.com.easyrent.screens.NewContratoScreen
import br.com.easyrent.screens.NewImovelScreen
import br.com.easyrent.screens.NewPessoaScreen
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
                        composable(route = "newPessoa"){ NewPessoaScreen(navController) }
                        composable(route = "newImovel"){ NewImovelScreen(navController) }
                        composable(route = "newContrato"){ NewContratoScreen(navController) }
                        composable(route = "listPessoas"){ ListagemPessoas(navController) }
                        composable(route = "listImoveis"){ ListagemImoveis(navController ) }
                        composable(route = "listContratos"){ ListagemContratos(navController ) }
                    }
                }
            }
        }
    }
}