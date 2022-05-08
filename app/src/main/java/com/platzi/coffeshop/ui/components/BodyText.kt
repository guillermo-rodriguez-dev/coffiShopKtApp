package com.platzi.coffeshop.ui.components


import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.platzi.coffeshop.ui.theme.CoffeShopTheme

@Composable
fun BodyText(body: String): Unit {
    Text(body, style =  MaterialTheme.typography.body2, textAlign = TextAlign.Justify)
}


@Preview(
    showBackground = true
)


@Composable
fun BodyTextPreview(): Unit {
    CoffeShopTheme {
        BodyText("titulo de prueba")
    }
}