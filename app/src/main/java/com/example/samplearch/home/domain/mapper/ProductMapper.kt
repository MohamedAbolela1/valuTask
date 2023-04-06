package com.example.samplearch.home.domain.mapper

import com.example.samplearch.home.data.model.ProductResponse
import com.example.samplearch.home.domain.model.Product


fun MutableList<ProductResponse>.toProductList(): MutableList<Product> {
    return this.map {
        it.toProduct()
    }.toMutableList()
}

fun ProductResponse.toProduct(): Product {
    return with(this) {
        Product(
            title = title,
            price = price,
            description = description,
            image = image,
            rate = rating?.rate
        )
    }
}

