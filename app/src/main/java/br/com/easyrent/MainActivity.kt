package br.com.easyrent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import br.com.easyrent.screens.NovoPessoaScreen
import br.com.easyrent.screens.NovoContratoScreen
import br.com.easyrent.screens.HomeScreen
import br.com.easyrent.screens.LoginScreen
import br.com.easyrent.ui.theme.EasyRentTheme
import com.google.accompanist.navigation.animation.composable

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
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
                        startDestination = "login"
                    ) {
                        composable(route = "login"){ LoginScreen(navController) }
                        composable(route = "home"){ HomeScreen(navController) }
                        composable(
                            route = "contratos?locatario={locatario}",
                            arguments = listOf(navArgument(name = "locatario") {
                                defaultValue = "Sem locatário"
                            })
                        ){
                            NovoContratoScreen(navController, it.arguments?.getString("locatario"))
                        }
                        composable(
                            route = "pessoa/{nome}/{tipo}",
                            arguments = listOf(
                                navArgument("nome") {
                                    type = NavType.StringType
                                },
                                navArgument("tipo") {
                                    type = NavType.StringType
                                }
                            )
                        ){
                            val nome: String? =
                                it.arguments?.getString("nome", "")
                            val tipo: String? =
                                it.arguments?.getString("tipo", "")
                            NovoPessoaScreen(navController, nome!!, tipo!!)
                        }
                    }
                }
            }
        }
    }
}