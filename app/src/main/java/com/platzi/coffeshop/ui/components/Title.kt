package com.platzi.coffeshop.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.platzi.coffeshop.ui.theme.CoffeShopTheme

@Composable
fun Title(title: String): Unit {
Text(title, style =  MaterialTheme.typography.h3)
}


@Preview(
    showBackground = true
)


@Composable
fun TitleTextPreview(): Unit {
    CoffeShopTheme {
        Title("titulo de prueba")
    }
}