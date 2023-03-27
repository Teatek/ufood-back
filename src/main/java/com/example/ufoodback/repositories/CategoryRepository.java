package com.example.ufoodback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ufoodback.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
