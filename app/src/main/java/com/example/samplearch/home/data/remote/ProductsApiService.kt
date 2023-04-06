package com.example.samplearch.home.data.remote

import com.example.samplearch.home.data.model.ProductResponse
import retrofit2.http.GET

interface ProductsApiService {
    @GET("products")
    suspend fun getProductsList(

    ): MutableList<ProductResponse>
}