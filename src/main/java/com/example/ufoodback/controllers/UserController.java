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

import com.example.ufoodback.models.User;
import com.example.ufoodback.repositories.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserRepository repository;

	@GetMapping("/users")
	public List<User> all() {
		return (List<User>) repository.findAll();
	}

	@GetMapping("/users/{id}")
	public User get(@PathVariable("id") int id) {
		Optional<User> u = repository.findById(id);
		return (User) u.get();
	}

	@PostMapping("/users")
	public User newUser(@RequestBody User newUser) {
		return repository.save(newUser);
	}

}
