package com.example.PizzeriaMenu.repository;

import com.example.PizzeriaMenu.model.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepository extends JpaRepository<Topping, Long> {
}
