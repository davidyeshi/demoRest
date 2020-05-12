package com.example.demoRest.payroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
@ComponentScan(basePackages = "com.example.demoRest")
public class LoadDatabase {

    // Spring boot runs all CommandLineRunner beans once the application context is loaded
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository, OrderRepository orderRepository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Bilbo","Baggins", "burglar")));
            log.info("Preloading " + repository.save(new Employee("Frodo","Baggins", "thief")));

            orderRepository.save(new Order("Macbook Pro", Status.COMPLETED));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> {
                log.info("Preloaded " + order);
            });
        };
    }
}
