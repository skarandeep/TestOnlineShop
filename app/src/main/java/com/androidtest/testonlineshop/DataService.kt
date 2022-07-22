package com.androidtest.testonlineshop

object DataService {
    var categories = listOf(Category("HATS", "hatimage"),
        Category("HOODIES","hoodieimage"),
        Category("SHIRTS", "shirtimage"),
        Category("DIGITAL ASSETS","digitalasset")
    )
    var hats = listOf(Product("gray hat","$10","hat1"),
        Product("green hat","$20","hat2"),
        Product("joy hat","$20","hat3"),
        Product("grayjoy hat","$30","hat4"),
        )

    var hoodies = listOf(Product("gray hoodie","$20","hoodie1"),
        Product("green hoodie","$20","hoodie2"),
        Product("black hoodie","$20","hoodie3"),
        Product("red hoodie","$30","hoodie4")
    )

    var shirts = listOf(Product("gray shirt","$20","shirt1"),
        Product("green shirt","$20","shirt2"),
        Product("black shirt","$20","shirt3"),
        Product("red shirt","$30","shirt4"),
        Product("redout shirt","$30","shirt5")
    )

    var digitals = listOf(Product("gray digital","$20","digital1"),
        Product("green digital","$20","digital2"),
        Product("black digital","$20","digital3"),
        Product("red digital","$30","digital4")
    )
}