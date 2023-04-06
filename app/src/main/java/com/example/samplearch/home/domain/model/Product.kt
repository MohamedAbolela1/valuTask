package com.example.samplearch.home.domain.model

import java.io.Serializable

data class Product(
    val title: String?,
    val price : Float? ,
    val description: String?,
    val image: String?,
    val rate: Float?,
) : Serializable
