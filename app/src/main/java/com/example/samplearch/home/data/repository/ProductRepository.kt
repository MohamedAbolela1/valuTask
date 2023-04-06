package com.example.samplearch.home.data.repository

import com.example.samplearch.home.data.model.ProductResponse
import com.example.samplearch.home.data.remote.ProductsRemoteDataSource
import javax.inject.Inject

class ProductRepository @Inject constructor(private val productsRemoteDataSource: ProductsRemoteDataSource) {
    suspend fun getProductsList(): MutableList<ProductResponse>? {
        return productsRemoteDataSource.getProducts()
    }
}