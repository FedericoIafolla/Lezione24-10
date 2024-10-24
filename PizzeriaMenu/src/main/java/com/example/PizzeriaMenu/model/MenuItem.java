package com.example.PizzeriaMenu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Aggiunto un campo id per la persistenza
    private String nome;
    private double prezzo;

    public MenuItem(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public MenuItem() {
    }
}
