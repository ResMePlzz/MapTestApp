package com.example.maptestapp.domain.MapKitModel

data class GeocoderResponseMetaData(
    val boundedBy: BoundedByX,
    val found: String,
    val request: String,
    val results: String
)