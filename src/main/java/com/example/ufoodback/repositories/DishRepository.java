package com.example.ufoodback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ufoodback.models.Dish;

public interface DishRepository extends JpaRepository<Dish, Integer> {
}
