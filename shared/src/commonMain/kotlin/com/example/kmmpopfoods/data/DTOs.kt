package com.example.kmmpopfoods.data

import kotlinx.serialization.Serializable
import com.example.kmmpopfoods.data.*
import kotlinx.serialization.Contextual
import com.example.kmmpopfoods.UUIDSerializer

@Serializable
data class Ingredient(
    @Contextual val id: UUID? = null,
    val name: String,
    val fat: Int,
    val protein: Int,
    val carbohydrates: Int,
    val custom: Boolean
)

@Serializable
data class Recipe(
    @Contextual val id: UUID? = null,
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
    @Contextual val id: UUID? = null,
    val username: String,
    val passwordHash: String,
    val fullName: String,
    val email: String,
    val recipes: List<Recipe> = listOf()
)

@Serializable
data class RecipeIngredient(
    @Contextual val id: UUID? = null,
    @Contextual val recipeId: UUID,
    @Contextual val ingredientId: UUID
)

@Serializable
data class UserRecipe(
    @Contextual val id: UUID? = null,
    @Contextual val userId: UUID,
    @Contextual val recipeId: UUID,
    val isFavorite: Boolean
)