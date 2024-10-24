package com.example.PizzeriaMenu.repository;

import com.example.PizzeriaMenu.model.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdineRepository extends JpaRepository<Ordine, Long> {
}
