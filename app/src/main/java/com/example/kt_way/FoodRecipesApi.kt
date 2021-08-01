package com.example.kt_way

import com.example.kt_way.models.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipesApi {

    @GET("/recipes/complexSearch")
    suspend fun getRecipes(
        @QueryMap queris: Map<String, String>
    ): Response<FoodRecipe>

}