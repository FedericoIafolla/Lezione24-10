package com.example.PizzeriaMenu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ElementCollection;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ElementCollection
    private List<String> ingredients;
    private int calories;
    private double price;
    private String dimensione;

    public Pizza(String name, List<String> ingredients, int calories, double price, String dimensione) {
        this.name = name;
        this.ingredients = ingredients;
        this.calories = calories;
        this.price = price;
        this.dimensione = dimensione;
    }
}
