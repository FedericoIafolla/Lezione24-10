package com.example.Pizzeria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.Pizzeria.model.Menu;
import com.example.Pizzeria.model.Pizza;
import com.example.Pizzeria.model.Topping;
import com.example.Pizzeria.model.Drink;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuTest {

    @Test
    public void testMenu() {
        List<Topping> toppings = new ArrayList<>();
        List<Drink> drinks = new ArrayList<>();
        List<Pizza> pizze = new ArrayList<>();

        Menu menu = new Menu(toppings, drinks, pizze);

        Pizza pizza = new Pizza("Pizza Margherita", Arrays.asList("Pomodoro", "Mozzarella", "Basilico"), 1104, 4.99, "Media");
        menu.getPizze().add(pizza);

        assertEquals(1, menu.getPizze().size());
        assertEquals(pizza, menu.getPizze().get(0));
    }
}
