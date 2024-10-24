package com.example.PizzeriaMenu.repository;

import com.example.PizzeriaMenu.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
