package com.example.ufoodback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ufoodback.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}
