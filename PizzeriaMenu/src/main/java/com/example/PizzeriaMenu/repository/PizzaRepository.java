package com.example.PizzeriaMenu.repository;

import com.example.PizzeriaMenu.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    List<Pizza> findByName(String name);
    List<Pizza> findByCaloriesLessThan(int calories);
}
