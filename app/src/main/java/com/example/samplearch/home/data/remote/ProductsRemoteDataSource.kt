package com.example.samplearch.home.data.remote

import com.example.samplearch.home.data.model.ProductResponse
import com.example.samplearch.source.remote.executer.RemoteExecutor
import javax.inject.Inject

class ProductsRemoteDataSource @Inject constructor(private val productsApiService: ProductsApiService) :
    RemoteExecutor() {
    suspend fun getProducts(): MutableList<ProductResponse>? {
        return executeApiCall { productsApiService.getProductsList() }
    }
}