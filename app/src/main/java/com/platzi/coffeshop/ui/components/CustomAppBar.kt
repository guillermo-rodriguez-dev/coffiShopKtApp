package com.platzi.coffeshop.ui.components

import android.widget.ImageButton
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.platzi.coffeshop.ui.theme.CoffeShopTheme


typealias NavegationAction = () -> Unit
@Composable
fun CustomAppBar(
    title: String? = null,
    navigationIcon: ImageVector? = null,
    navigationAction: NavegationAction?=null
) {
    val titleText = title ?: ""
    if(navigationIcon!=null &&navigationAction != null){
        TopAppBar(
            title = { Text(text = titleText) },
            backgroundColor = MaterialTheme.colors.primary,
            navigationIcon = {
                IconButton(onClick = {

                }){
                    Icon(imageVector = navigationIcon, "")
                }
            }
        )
    }else{
        TopAppBar(
            title = { Text(text = titleText) },
            backgroundColor = MaterialTheme.colors.primary
        )



    }
}

@Preview(showBackground = true)
@Composable
fun CustomAppBarPreview() {
    CoffeShopTheme {
        CustomAppBar(title = "CoffeForCodders")
    }
}