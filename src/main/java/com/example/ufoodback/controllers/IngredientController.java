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

import com.example.ufoodback.models.Ingredient;
import com.example.ufoodback.repositories.IngredientRepository;

@RestController
@RequestMapping("/api")
public class IngredientController {
	@Autowired
	private IngredientRepository repository;

	@GetMapping("/ingredients")
	public List<Ingredient> all() {
		return (List<Ingredient>) repository.findAll();
	}

	@GetMapping("/ingredients/{id}")
	public Ingredient get(@PathVariable("id") int id) {
		Optional<Ingredient> u = repository.findById(id);
		return (Ingredient) u.get();
	}

	@PostMapping("/ingredients")
	public Ingredient newIngredient(@RequestBody Ingredient newIngredient) {
		return repository.save(newIngredient);
	}

}
