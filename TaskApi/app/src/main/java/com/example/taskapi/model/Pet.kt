package com.example.taskapi.model

data class Pet(
    var id: Int,
    var name: String,
    var adopted: Boolean,
    var image: String,
    var age: Int,
    var gender: String
)
