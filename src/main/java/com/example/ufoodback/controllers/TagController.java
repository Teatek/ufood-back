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

import com.example.ufoodback.models.Tag;
import com.example.ufoodback.repositories.TagRepository;

@RestController
@RequestMapping("/api")
public class TagController {
	@Autowired
	private TagRepository repository;

	@GetMapping("/tags")
	public List<Tag> all() {
		return (List<Tag>) repository.findAll();
	}

	@GetMapping("/tags/{id}")
	public Tag get(@PathVariable("id") int id) {
		Optional<Tag> u = repository.findById(id);
		return (Tag) u.get();
	}

	@PostMapping("/tags")
	public Tag newTag(@RequestBody Tag newTag) {
		return repository.save(newTag);
	}

}

