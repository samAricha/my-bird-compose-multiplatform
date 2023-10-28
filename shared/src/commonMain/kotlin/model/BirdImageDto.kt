package model

import kotlinx.serialization.Serializable

@Serializable
data class BirdImageDto(
    val author: String,
    val category: String,
    val path: String
)