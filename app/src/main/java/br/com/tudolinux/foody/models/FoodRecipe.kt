package br.com.tudolinux.foody.models

import com.google.gson.annotations.SerializedName

data class FoodRecipe(
    @SerializedName("result")
    val result: List<Result>
)