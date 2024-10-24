package com.example.Pizzeria.model;

import java.util.List;

public class Pizza {
    private String name;
    private List<String> ingredients;
    private int calories;
    private double price;
    private String dimensione;

    public Pizza(String nome, List<String> ingredienti, int calorie, double prezzo, String dimensione) {
        this.name = nome;
        this.ingredients = ingredienti;
        this.calories = calorie;
        this.price = prezzo;
        this.dimensione = dimensione;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    public String getDimensione() {
        return dimensione;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public void setIngredienti(List<String> ingredienti) {
        this.ingredients = ingredienti;
    }

    public void setCalorie(int calorie) {
        this.calories = calorie;
    }

    public void setPrezzo(double prezzo) {
        this.price = prezzo;
    }

    public void setDimensione(String dimensione) {
        this.dimensione = dimensione;
    }
}
