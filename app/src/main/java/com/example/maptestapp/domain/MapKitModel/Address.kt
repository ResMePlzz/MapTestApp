package com.example.maptestapp.domain.MapKitModel

data class Address(
    val Components: List<Component>,
    val country_code: String,
    val formatted: String
)