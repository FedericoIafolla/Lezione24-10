package com.example.Pizzeria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.Pizzeria.model.Menu;
import com.example.Pizzeria.model.Pizza;
import com.example.Pizzeria.model.Topping;
import com.example.Pizzeria.model.Drink;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MenuTest {

    @Test
    public void testMenu() {
        String path = "src/test/resources/menu.csv";
        List<Topping> toppings = new ArrayList<>();
        List<Drink> drinks = new ArrayList<>();
        List<Pizza> pizze = new ArrayList<>();

        Menu menu = new Menu(toppings, drinks, pizze);

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dati = line.split(",");
                if (dati[0].equals("Pizza")) {
                    Pizza pizza = new Pizza(dati[1], List.of(dati[2].split(";")), Integer.parseInt(dati[3]), Double.parseDouble(dati[4]), dati[5]);
                    menu.getPizze().add(pizza);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(1, menu.getPizze().size());
        Pizza expectedPizza = menu.getPizze().get(0);
        assertEquals("Pizza Margherita", expectedPizza.getName());
    }
}
