package com.example.Pizzeria;

import com.example.Pizzeria.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PizzeriaMenuApplication {

	private static final Logger logger = LoggerFactory.getLogger(PizzeriaMenuApplication.class);

	@Value("${costo.coperto}")
	private double costoCoperto;

	public static void main(String[] args) {
		SpringApplication.run(PizzeriaMenuApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ApplicationContext ctx) {
		return args -> {
			Menu menu = ctx.getBean(Menu.class);
			System.out.println("**********************************");
			System.out.println("            PIZZERIA MENU         ");
			System.out.println("**********************************\n");

			System.out.println("Pizze:");
			menu.getPizze().forEach(p ->
					System.out.printf("%s (%s) - Calorie: %d, Prezzo: %.2f€%n",
							p.getName(), String.join(", ", p.getIngredients()), p.getCalories(), p.getPrice()));

			System.out.println("\nToppings:");
			menu.getToppings().forEach(t ->
					System.out.printf("%s - Calorie: %d, Prezzo: %.2f€%n",
							t.getName(), t.getCalories(), t.getPrice()));

			System.out.println("\nDrinks:");
			menu.getBevande().forEach(d ->
					System.out.printf("%s - Calorie: %d, Prezzo: %.2f€%n",
							d.getName(), d.getCalories(), d.getPrice()));

			System.out.println("\n**********************************");
			System.out.println("            ORDINE                ");
			System.out.println("**********************************");

			Tavolo tavolo = new Tavolo(1, 4, "occupato");

			List<MenuItem> elementiOrdine = new ArrayList<>();
			elementiOrdine.add(new MenuItem(menu.getPizze().get(0).getName(), menu.getPizze().get(0).getPrice()));
			elementiOrdine.add(new MenuItem(menu.getBevande().get(0).getName(), menu.getBevande().get(0).getPrice()));

			double importoTotale = elementiOrdine.stream().mapToDouble(MenuItem::getPrezzo).sum() + costoCoperto * 2;

			Ordine ordine = new Ordine(1, "in corso", 2, LocalDateTime.now(), elementiOrdine, importoTotale);

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			String dataFormattata = ordine.getOraAcquisizione().format(formatter);

			logger.info("Ordine creato: Numero Ordine: {}, Stato: {}, Coperti: {}, Ora Acquisizione: {}, Importo Totale: {}€",
					ordine.getNumeroOrdine(), ordine.getStato(), ordine.getNumeroCoperti(),
					dataFormattata, String.format("%.2f", ordine.getImportoTotale()));

			System.out.println("\n**********************************");
			System.out.printf("%-20s: %d%n", "Numero Ordine", ordine.getNumeroOrdine());
			System.out.printf("%-20s: %s%n", "Stato", ordine.getStato());
			System.out.printf("%-20s: %d%n", "Coperti", ordine.getNumeroCoperti());
			System.out.printf("%-20s: %s%n", "Ora Acquisizione", dataFormattata);
			System.out.printf("%-20s: %.2f€%n", "Importo Totale", ordine.getImportoTotale());
			System.out.println("**********************************");
		};
	}
}
