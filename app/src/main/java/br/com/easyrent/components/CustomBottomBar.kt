package br.com.easyrent.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import androidx.navigation.navOptions

@Composable
fun CustomBottomBar(navController: NavHostController) {
    val items = remember {
        listOf(
            Pair("Imóveis", Icons.Filled.Home),
            Pair("Locatários", Icons.Filled.Search),
            Pair("Contratos", Icons.Filled.Email),
        )
    }

    var selectedItem by remember {
        mutableStateOf(items.first())
    }

    BottomAppBar(actions = {
        items.forEach { item ->
            val text = item.first
            val icon = item.second
            NavigationBarItem(
                selected = selectedItem == item,
                onClick = {
                    selectedItem = item
                    val route = when(text) {
                        "Imóveis" -> "listImoveis"
                        "Locatários" -> "listPessoas"
                        else -> "listContratos"
                    }
                    navController.navigate(route, navOptions = navOptions {
                        launchSingleTop = true
                        popUpTo(navController.graph.startDestinationId)
                    })
                          },
                icon = {
                    Icon(icon, contentDescription = null)
                },
                label = {
                    Text(text = text)
                })
        }
    })
}