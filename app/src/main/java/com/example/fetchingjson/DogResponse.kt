package com.example.fetchingjson

import com.google.gson.annotations.SerializedName

data class DogResponse (

    @SerializedName("message") val images:List<String>,
    val status:String

    )