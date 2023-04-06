package com.example.samplearch.home.domain.mapper

import com.example.samplearch.home.data.model.ProductResponse
import com.example.samplearch.home.domain.model.Product
import com.example.samplearch.model.StringModel
import com.example.samplearch.utils.ui.DateFormat
import com.example.samplearch.utils.ui.getValidText


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

