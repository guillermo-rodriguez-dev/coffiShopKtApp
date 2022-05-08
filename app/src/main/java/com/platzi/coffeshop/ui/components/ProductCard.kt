package com.platzi.coffeshop.ui.components

import com.platzi.coffeshop.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.platzi.coffeshop.ui.theme.CoffeShopTheme
import com.platzi.coffeshop.ui.theme.PlatziBlue
import com.platzi.coffeshop.ui.theme.PlatziGreen

enum class CountryISO(
    val image: Int,
    val flag: Int,
    val surfaceColor: Color,
) {
    COL(R.drawable.co, R.drawable.flagco, PlatziBlue),
    BRA(R.drawable.br, R.drawable.flagbr, PlatziGreen),
    CRI(R.drawable.ri, R.drawable.flagri, PlatziGreen),
    NIC(R.drawable.ni, R.drawable.flagni, PlatziBlue)
}

@Composable
fun ProductCard(name: String, sumery: String, price: Double, currency: String, countryISO: CountryISO) {

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .clickable { }
        .size(480.dp), elevation = 10.dp, shape = MaterialTheme.shapes.small) {
        Image(painter = painterResource(id = countryISO.flag), contentDescription = null)
        androidx.compose.material.Surface(
            modifier = Modifier.fillMaxWidth(),
            color = countryISO.surfaceColor
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = name, style = MaterialTheme.typography.h4)
                Text(
                    text = sumery,
                    style = MaterialTheme.typography.body1
                )
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Row() {
                        Image(
                            painter = painterResource(id = countryISO.image),
                            contentDescription = null,
                            modifier = Modifier.size(32.dp, 32.dp)
                        )
                        Text(
                            text = "$price $currency",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.End,
                            style = MaterialTheme.typography.h4
                        )
                    }
                }
            }
        }
    }
}

@Preview
    (
    showBackground = true
)

@Composable
fun ProductCardPreview() {
    CoffeShopTheme() {
        ProductCard(name = "Cafe Colombia", sumery = "Cafe de origen de las montañas", price = 35.0, currency = "dolares" , CountryISO.BRA)
    }

}