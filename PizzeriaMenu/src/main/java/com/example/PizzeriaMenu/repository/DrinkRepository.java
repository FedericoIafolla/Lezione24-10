package com.example.PizzeriaMenu.repository;

import com.example.PizzeriaMenu.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink, Long> {
}
