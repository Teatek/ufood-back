package com.example.ufoodback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ufoodback.models.RecipeIngredients;

public interface RecipeIngredientsRepository extends JpaRepository<RecipeIngredients, Integer> {
}
