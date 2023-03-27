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

import com.example.ufoodback.models.Category;
import com.example.ufoodback.repositories.CategoryRepository;

@RestController
@RequestMapping("/api")
public class CategoryController {
	@Autowired
	private CategoryRepository repository;

	@GetMapping("/categories")
	public List<Category> all() {
		return (List<Category>) repository.findAll();
	}

	@GetMapping("/categories/{id}")
	public Category get(@PathVariable("id") int id) {
		Optional<Category> u = repository.findById(id);
		return (Category) u.get();
	}

	@PostMapping("/categories")
	public Category newCategory(@RequestBody Category newCategory) {
		return repository.save(newCategory);
	}

}
