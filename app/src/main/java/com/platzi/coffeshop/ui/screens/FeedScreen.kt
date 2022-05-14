package com.platzi.coffeshop.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.platzi.coffeshop.ui.components.BodyText
import com.platzi.coffeshop.ui.components.Title
import com.platzi.coffeshop.ui.theme.CoffeShopTheme
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Modifier
import com.platzi.coffeshop.ui.components.CountryISO
import com.platzi.coffeshop.ui.components.ProductCard
import androidx.compose.foundation.lazy.items
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun FeedScreen( navController: NavController): Unit {

    val list = listOf<CountryISO>(
        CountryISO.COL, CountryISO.BRA, CountryISO.NIC, CountryISO.CRI
    )
    CoffeShopTheme() {
        androidx.compose.material.Surface(color=MaterialTheme.colors.background) {
            LazyColumn(verticalArrangement = Arrangement.SpaceBetween){
                item { 
                    Column(
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Title(title = "Prueba")
                        BodyText(body = "Body")
                    }
                }
                items(list){
                    country -> ProductCard(
                    name = "cafe",
                    sumery = "cafe de prueba",
                    price = 35.0,
                    currency = "USD",
                    countryISO = country
                ){
                        navController.navigate("item/${country.iso}"){

                            launchSingleTop= true
                        }

                }
                }
            }
        }
    }
}


@Preview(
    showBackground = true
)

@Composable
fun FeedScrrenPreviw(){
    val navController = rememberNavController( )
    FeedScreen(navController)
}