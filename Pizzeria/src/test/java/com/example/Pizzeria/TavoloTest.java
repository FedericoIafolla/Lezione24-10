package com.example.Pizzeria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.Pizzeria.model.Tavolo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TavoloTest {

    @Test
    public void testCreazioneTavolo() {
        String path = "src/test/resources/tavolo.csv";
        Tavolo tavolo = null;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] dati = line.split(",");
                int numero = Integer.parseInt(dati[0]);
                int numeroCopertiMassimo = Integer.parseInt(dati[1]);
                String stato = dati[2];
                tavolo = new Tavolo(numero, numeroCopertiMassimo, stato);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(1, tavolo.getNumero());
        assertEquals(4, tavolo.getNumeroCopertiMassimo());
        assertEquals("libero", tavolo.getStato());
    }
}
