package com.example.Pizzeria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.Pizzeria.model.Ordine;
import com.example.Pizzeria.model.MenuItem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrdineTest {

    @Test
    public void testCalcoloTotale() {
        String path = "src/test/resources/ordine.csv";
        List<MenuItem> elementi = new ArrayList<>();
        double totaleAtteso = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dati = line.split(",");
                MenuItem menuItem = new MenuItem(dati[0], Double.parseDouble(dati[1]));
                elementi.add(menuItem);
                totaleAtteso += Double.parseDouble(dati[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Ordine ordine = new Ordine(1, "in corso", 4, LocalDateTime.now(), elementi, totaleAtteso);
        ordine.setImportoTotale(totaleAtteso);
        assertEquals(totaleAtteso, ordine.getImportoTotale());
    }
}
