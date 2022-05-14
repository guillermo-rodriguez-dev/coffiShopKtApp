package com.platzi.coffeshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.platzi.coffeshop.ui.components.CountryISO
import com.platzi.coffeshop.ui.screens.DetailsScreen
import com.platzi.coffeshop.ui.screens.FeedScreen
import com.platzi.coffeshop.ui.theme.CoffeShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NovigationHos()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoffeShopTheme {
        Greeting("Android")
    }
}


@Composable
fun NovigationHos() {
    val navController = rememberNavController()
    CoffeShopTheme() {
        androidx.compose.material.Surface(color = MaterialTheme.colors.background) {
            NavHost(navController = navController, startDestination = "feed") {
                composable(route = "feed") {
                    FeedScreen(navController)
                }

                composable(route = "item/{countryIso}") {


                        backStackEntry ->
                    val countryIsoString =
                        backStackEntry.arguments?.getString("countryIso") ?: "COL"
                    val countryIso = CountryISO.valueOf(countryIsoString)
                    DetailsScreen(navController, countryIso)
                }
            }
        }

    }
}
