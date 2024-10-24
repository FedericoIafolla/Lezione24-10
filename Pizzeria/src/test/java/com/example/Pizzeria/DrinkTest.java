package com.example.Pizzeria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.Pizzeria.model.Drink;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DrinkTest {

    @Test
    public void testDrink() {
        String path = "src/test/resources/drink.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dati = line.split(",");
                if (!dati[0].equals("Nome")) {
                    int quantità = Integer.parseInt(dati[2]);
                    Drink drink = new Drink(dati[0], quantità, Double.parseDouble(dati[1]));
                    assertEquals(dati[0], drink.getName());
                    assertEquals(quantità, drink.getCalories());
                    assertEquals(Double.parseDouble(dati[1]), drink.getPrice());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
