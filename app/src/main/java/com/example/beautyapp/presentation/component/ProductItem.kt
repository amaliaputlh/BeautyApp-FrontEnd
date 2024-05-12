package com.example.beautyapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.beautyapp.R
import com.example.beautyapp.model.Product
import com.example.beautyapp.ui.theme.BeautyAppTheme

@Composable
fun ProductItem(
    product: Product,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(product.id)
        }
    ) {
        Image(
            painter = painterResource(id = product.photo),
            contentDescription = product.name, modifier = Modifier
                .clip(CircleShape)
                .size(120.dp)
        )
        Text(
            text = product.name,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(140.dp),
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ArtisItemHorizontalPreview() {
    BeautyAppTheme {
        ProductItem(
            product = Product(
                1,
                "Foundation",
                77,
                "Complexion",
                R.drawable.foundation
            ),
            onItemClicked = {
                    productId ->
                println("Product Id : $productId")
            }
        )
    }
}

