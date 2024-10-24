package com.example.PizzeriaMenu;

import com.example.PizzeriaMenu.model.Drink;
import com.example.PizzeriaMenu.model.Pizza;
import com.example.PizzeriaMenu.model.Topping;
import com.example.PizzeriaMenu.repository.DrinkRepository;
import com.example.PizzeriaMenu.repository.PizzaRepository;
import com.example.PizzeriaMenu.repository.ToppingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(ApplicationContext context, PizzaRepository pizzaRepo, DrinkRepository drinkRepo, ToppingRepository toppingRepo) {
        return args -> {
            Pizza margherita = context.getBean("margheritaPizza", Pizza.class);
            Drink coke = new Drink("Coca-Cola", 140, 1.50);
            Topping pepperoni = new Topping("Pepperoni", 300, 1.00);

            pizzaRepo.save(margherita);
            drinkRepo.save(coke);
            toppingRepo.save(pepperoni);
        };
    }
}
