package com.example.beautyapp.data

import com.example.beautyapp.R
import com.example.beautyapp.model.Product
import com.example.beautyapp.model.Brand
import com.example.beautyapp.model.Look

object DummyData {
    val AllProducts = listOf(
        Product(
            id = 1,
            name = "Foundation",
            purchase = 105,
            categories = "Complexion",
            photo = R.drawable.foundy
        ),
        Product(
            id = 2,
            name = "Concealer",
            purchase = 99,
            categories = "Complexion",
            photo = R.drawable.concealer
        ),
        Product(
            id = 3,
            name = "Eyeliner",
            purchase = 390,
            categories = "Eye Make Up",
            photo = R.drawable.eyeliner
        ),
        Product(
            id = 4,
            name = "Eyeshadow",
            purchase = 276,
            categories = "Eye Make Up",
            photo = R.drawable.eyeshadow
        ),
        Product(
            id = 5,
            name = "Lip Liner",
            purchase = 1090,
            categories = "Lip Product",
            photo = R.drawable.lipliner
        ),
        Product(
            id = 6,
            name = "Lipstick",
            purchase = 1289,
            categories = "Lip Product",
            photo = R.drawable.lipy
        ),
        Product(
            id = 7,
            name = "Cheek Tint",
            purchase = 897,
            categories = "Blush",
            photo = R.drawable.blush
        ),
        Product(
            id = 8,
            name = "Powder",
            purchase = 80,
            categories = "Make Up Setter",
            photo = R.drawable.powder
        ),
        Product(
            id = 9,
            name = "Mascara",
            purchase = 390,
            categories = "Eye Make Up",
            photo = R.drawable.mascara
        ),
        Product(
            id = 10,
            name = "Brows",
            purchase = 390,
            categories = "Eye Make Up",
            photo = R.drawable.brow
        )
    )


    val AllBrands = listOf(
        Brand(
            id = 1,
            name = "Make Over",
            namaProduk = "PT Paragon Technology and Innovation",
            rating = "4.9",
            photo = R.drawable.makeover
        ),
        Brand(
            id = 2,
            name = "Huda Beauty",
            namaProduk = "Huda Kattan",
            rating = "4.7",
            photo = R.drawable.huda
        ),
        Brand(
            id = 3,
            name = "Esqa",
            namaProduk = "Social Bella",
            rating = "4.1",
            photo = R.drawable.esqa
        ),
        Brand(
            id = 4,
            name = "Etude House",
            namaProduk = "Amore Pacific",
            rating = "4.5",
            photo = R.drawable.etude
        ),
        Brand(
            id = 5,
            name = "Rare Beauty",
            namaProduk = "Selena Gomez",
            rating = "3.7",
            photo = R.drawable.rare
        ),
        Brand(
            id = 6,
            name = "Rollover Reaction",
            namaProduk = "Rollover Reaction",
            rating = "4.8",
            photo = R.drawable.rr
        ),
        Brand(
            id = 7,
            name = "NARS",
            namaProduk = "NARS Cosmetics",
            rating = "4.5",
            photo = R.drawable.nars
        ),
        Brand(
            id = 8,
            name = "MAC",
            namaProduk = "MAC Cosmetics",
            rating = "4.9",
            photo = R.drawable.mac
        ),
        Brand(
            id = 9,
            name = "Maybelline",
            namaProduk = "Maybelline",
            rating = "4.8",
            photo = R.drawable.maybelline
        ),
        Brand(
            id = 10,
            name = "Innisfree",
            namaProduk = "Amore Pacific",
            rating = "3.5",
            photo = R.drawable.innis
        )

    )

    val AllLooks = listOf(
        Look(
            id = 1,
            name = "Natural",
            photo = R.drawable.natural
        ),
        Look(
            id = 2,
            name = "Korean",
            photo = R.drawable.korean
        ),
        Look(
            id = 3,
            name = "Nude",
            photo = R.drawable.nude
        ),
        Look(
            id = 4,
            name = "Fairy",
            photo = R.drawable.fairy
        ),
        Look(
            id = 5,
            name = "Baddie",
            photo = R.drawable.baddie
        ),
        Look(
            id = 6,
            name = "Soft Glam",
            photo = R.drawable.softglam
        ),
        Look(
            id = 7,
            name = "Bronze",
            photo = R.drawable.bronze
        ),
        Look(
            id = 8,
            name = "Summer",
            photo = R.drawable.summer
        ),
        Look(
            id = 9,
            name = "Eye",
            photo = R.drawable.eye
        ),
        Look(
            id = 10,
            name = "Fresh",
            photo = R.drawable.fresh
        ),



    )

}