package br.com.easyrent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.easyrent.screens.ContratoScreen
import br.com.easyrent.screens.ImovelScreen
import br.com.easyrent.screens.PessoaScreen
import br.com.easyrent.screens.HomeScreen
import br.com.easyrent.screens.ListContratosScreen
import br.com.easyrent.screens.ListImoveisScreen
import br.com.easyrent.screens.ListPessoasScreen
import br.com.easyrent.screens.LoginScreen
import br.com.easyrent.ui.theme.EasyRentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EasyRentTheme {
                val navController = rememberNavController()
                Surface(color = MaterialTheme.colorScheme.background) {
                    Column(Modifier.fillMaxSize()) {
                        NavHost(
                            navController = navController,
                            startDestination = "home",
                            Modifier.weight(1f)
                        ) {
                            composable(route = "login"){ LoginScreen(navController) }
                            composable(route = "home"){ HomeScreen(navController) }
                            composable(route = "newPessoa"){ PessoaScreen(navController) }
                            composable(route = "newImovel"){ ImovelScreen(navController) }
                            composable(route = "newContrato"){ ContratoScreen(navController) }
                            composable(route = "listPessoas"){ ListPessoasScreen(navController) }
                            composable(route = "listImoveis"){ ListImoveisScreen(navController ) }
                            composable(route = "listContratos"){ ListContratosScreen(navController ) }
                        }
                    }
                }
            }
        }
    }
}
