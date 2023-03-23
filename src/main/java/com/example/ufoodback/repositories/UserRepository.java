package com.example.ufoodback.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.ufoodback.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	User findByUsername(String username);
}
