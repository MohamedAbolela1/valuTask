package com.example.samplearch.home.data.model

import com.squareup.moshi.Json

data class ProductResponse(
    @Json(name = "id")
    val id: Int?,
    @Json(name = "title")
    val title: String?,
    @Json(name = "price")
    val price: Float?,
    @Json(name = "description")
    val description: String?,
    @Json(name = "category")
    val category: String?,
    @Json(name = "image")
    val image: String?,
    @Json(name = "rating")
    val rating: Rating?,

){
    data class Rating(
        @Json(name = "rate")
        val rate: Float?,
        @Json(name = "count")
        val count: Int?
    )
}
