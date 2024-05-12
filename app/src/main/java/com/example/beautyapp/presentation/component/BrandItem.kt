package com.example.beautyapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.beautyapp.R
import com.example.beautyapp.model.Brand
import com.example.beautyapp.navigation.Screen
import com.example.beautyapp.ui.theme.BeautyAppTheme

@Composable
fun BrandItem(
    brand: Brand,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxWidth()

    ) {
        Image(
            painter = painterResource(id = brand.photo),
            contentDescription = brand.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .size(80.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = brand.name, style = MaterialTheme.typography.titleMedium)
                Text(text = brand.namaProduk, color = MaterialTheme.colorScheme.tertiary, style = MaterialTheme.typography.titleSmall)
                Text(text = "Rating: ${brand.rating}", textAlign = TextAlign.Right,color = MaterialTheme.colorScheme.tertiary, style = MaterialTheme.typography.titleSmall)

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BrandItemPreview() {
    BeautyAppTheme {
        BrandItem(
            brand = Brand(
                1,
                "Huda Beauty",
                "Huda Kattan",
                "4.7",
                R.drawable.huda
            )

        )
    }
}
