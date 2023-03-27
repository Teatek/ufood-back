package com.example.ufoodback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ufoodback.models.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}

