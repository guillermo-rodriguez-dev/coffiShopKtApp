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

@Composable
fun FeedScreen(): Unit {
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
            }
        }
    }
}


@Preview(
    showBackground = true
)

@Composable
fun FeedScrrenPreviw(){
    FeedScreen()
}