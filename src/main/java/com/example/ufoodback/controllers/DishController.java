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

import com.example.ufoodback.models.Dish;
import com.example.ufoodback.repositories.DishRepository;

@RestController
@RequestMapping("/api")
public class DishController {
	@Autowired
	private DishRepository repository;

	@GetMapping("/dishes")
	public List<Dish> all() {
		return (List<Dish>) repository.findAll();
	}

	@GetMapping("/dishes/{id}")
	public Dish get(@PathVariable("id") int id) {
		Optional<Dish> u = repository.findById(id);
		return (Dish) u.get();
	}

	@PostMapping("/dishes")
	public Dish newDish(@RequestBody Dish newDish) {
		return repository.save(newDish);
	}

}
