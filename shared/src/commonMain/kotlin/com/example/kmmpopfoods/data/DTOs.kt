package com.example.kmmpopfoods.data

import kotlinx.serialization.Serializable

@Serializable
data class Ingredient(
    val id: UUID? = null,
    val name: String,
    val fat: Int,
    val protein: Int,
    val carbohydrates: Int,
    val custom: Boolean
)

@Serializable
data class Recipe(
    val id: UUID? = null,
    val name: String,
    val instructions: String,
    val description: String,
    val servingSize: Int,
    val preparationTime: Int,
    val imageUrl: String,
    val custom: Boolean,
    val ingredients: List<Ingredient> = listOf()
)

@Serializable
data class User(
    val id: UUID? = null,
    val username: String,
    val passwordHash: String,
    val fullName: String,
    val email: String,
    val recipes: List<Recipe> = listOf()
)

@Serializable
data class RecipeIngredient(
    val id: UUID? = null,
    val recipeId: UUID,
    val ingredientId: UUID
)

@Serializable
data class UserRecipe(
    val id: UUID? = null,
    val userId: UUID,
    val recipeId: UUID,
    val isFavorite: Boolean
)