package com.example.Pizzeria.model;

import java.util.List;

public class Menu {
    private List<Pizza> pizze;
    private List<Drink> bevande;
    private List<Topping> toppings;

    public Menu(List<Topping> toppings, List<Drink> bevande, List<Pizza> pizze) {
        this.toppings = toppings;
        this.bevande = bevande;
        this.pizze = pizze;
    }

    public List<Pizza> getPizze() {
        return pizze;
    }

    public void setPizze(List<Pizza> pizze) {
        this.pizze = pizze;
    }

    public List<Drink> getBevande() {
        return bevande;
    }

    public void setBevande(List<Drink> bevande) {
        this.bevande = bevande;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}
