package com.example.beautyapp.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.beautyapp.R
import com.example.beautyapp.data.DummyData
import com.example.beautyapp.model.Brand
import com.example.beautyapp.model.Product
import com.example.beautyapp.navigation.Screen
import com.example.beautyapp.presentation.component.BrandItem
import com.example.beautyapp.presentation.component.ProductItem
import com.example.beautyapp.presentation.component.shareItem


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    products: List<Product> = DummyData.AllProducts,
    brands: List<Brand> = DummyData.AllBrands
) {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Beauty App") },
                actions = {
                    IconButton(onClick = { shareItem(context) }) {
                        Icon(
                            imageVector = Icons.Default.Share,
                            contentDescription = stringResource(
                                id = R.string.menu_share
                            )
                        )
                    }

                }
            )
        }
    ) {contentPadding ->
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = modifier
                .padding(contentPadding)
        ) {
            item {
                LazyRow(
                    contentPadding = PaddingValues(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = modifier
                ) {
                    items(products, key = { it.id }) {
                        ProductItem(product = it) { productId ->
                            navController.navigate(Screen.DetailProduct.route + "/$productId")
                        }
                    }
                }
            }
            items(brands, key = { it.id }) {
                BrandItem(brand = it, modifier = Modifier.padding(horizontal = 16.dp))
            }
        }
    }
}