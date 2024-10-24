package com.example.Pizzeria.config;

import com.example.Pizzeria.model.Drink;
import com.example.Pizzeria.model.Menu;
import com.example.Pizzeria.model.Pizza;
import com.example.Pizzeria.model.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MenuConfig {

    @Bean
    public Pizza margherita() {
        return new Pizza("Pizza Margherita", Arrays.asList("pomodoro", "mozzarella"), 1104, 4.99, "Normale");
    }

    @Bean
    public Pizza hawaiana() {
        return new Pizza("Pizza Hawaiana", Arrays.asList("pomodoro", "mozzarella", "prosciutto", "ananas"), 1024, 6.49, "Normale");
    }

    @Bean
    public Pizza salame() {
        return new Pizza("Pizza al Salame", Arrays.asList("pomodoro", "mozzarella", "salame"), 1160, 5.99, "Normale");
    }

    @Bean
    public Pizza margheritaXL() {
        return new Pizza("Pizza Margherita XL", Arrays.asList("pomodoro", "mozzarella"), 1500, 7.99, "XL");
    }

    @Bean
    public Pizza hawaianaXL() {
        return new Pizza("Pizza Hawaiana XL", Arrays.asList("pomodoro", "mozzarella", "prosciutto", "ananas"), 1400, 9.49, "XL");
    }

    @Bean
    public Pizza salameXL() {
        return new Pizza("Pizza al Salame XL", Arrays.asList("pomodoro", "mozzarella", "salame"), 1600, 8.99, "XL");
    }

    @Bean
    public Topping formaggio() {
        return new Topping("Formaggio", 92, 0.69);
    }

    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto", 35, 0.99);
    }

    @Bean
    public Topping cipolle() {
        return new Topping("Cipolle", 22, 0.69);
    }

    @Bean
    public Topping ananas() {
        return new Topping("Ananas", 24, 0.79);
    }

    @Bean
    public Topping salameTopping() {
        return new Topping("Salame", 86, 0.99);
    }

    @Bean
    public Drink limonata() {
        return new Drink("Limonata (0.33l)", 128, 1.29);
    }

    @Bean
    public Drink acqua() {
        return new Drink("Acqua (0.5l)", 0, 1.29);
    }

    @Bean
    public Drink vino() {
        return new Drink("Vino (0.75l, 13%)", 607, 7.49);
    }

    @Bean
    public Menu menu() {
        List<Pizza> pizze = Arrays.asList(margherita(), hawaiana(), salame(), margheritaXL(), hawaianaXL(), salameXL());
        List<Topping> toppings = Arrays.asList(formaggio(), prosciutto(), cipolle(), ananas(), salameTopping());
        List<Drink> bevande = Arrays.asList(limonata(), acqua(), vino());
        return new Menu(toppings, bevande, pizze);
    }
}
