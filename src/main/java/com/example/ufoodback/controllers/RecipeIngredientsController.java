package com.example.ufoodback.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ufoodback.models.RecipeIngredients;
import com.example.ufoodback.repositories.RecipeIngredientsRepository;

@RestController
@RequestMapping("/api")
public class RecipeIngredientsController {
	@Autowired
	private RecipeIngredientsRepository repository;

	@GetMapping("/recipeIngredients")
	public List<RecipeIngredients> all() {
		return (List<RecipeIngredients>) repository.findAll();
	}

	@GetMapping("/recipeIngredients/{id}")
	public RecipeIngredients get(@PathVariable("id") int id) {
		Optional<RecipeIngredients> u = repository.findById(id);
		return (RecipeIngredients) u.get();
	}

	@PostMapping("/recipeIngredients")
	public RecipeIngredients newRecipeIngredient(@RequestBody RecipeIngredients newRecipeIngredient) {
		return repository.save(newRecipeIngredient);
	}

}

