package com.example.PizzeriaMenu.config;

import com.example.PizzeriaMenu.model.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;

@Configuration
public class AppConfig {

    @Bean
    public Pizza margheritaPizza() {
        return new Pizza("Pizza Margherita", Arrays.asList("Pomodoro", "Mozzarella", "Basilico"), 800, 4.99, "Media");
    }
}
