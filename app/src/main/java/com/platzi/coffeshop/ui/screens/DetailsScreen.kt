package com.platzi.coffeshop.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.platzi.coffeshop.ui.components.CountryISO

@Composable
fun DetailsScreen(navController: NavController, countryISO: CountryISO) {
    Column() {
        Text(text = "$countryISO.iso", color = Color.Green)
        Button(onClick = { navController.navigate("feed") {
            popUpTo("feed")
        } }) {

        }
    }
}


@Preview(
    showBackground = true
)


@Composable
fun DetailScreenPreview(

) {

    val navController = rememberNavController()
    DetailsScreen(navController, CountryISO.COL)
}