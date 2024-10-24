package com.example.PizzeriaMenu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Topping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int calories;
    private double price;

    public Topping(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
}
