package com.webhello.webinitiallize;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        return args -> {
            System.out.println("Let's inspect the beans provided by Sprng Boot!");
            String[] beanNameNames = context.getBeanDefinitionNames();
            Arrays.sort(beanNameNames);
            for (String beanName : beanNameNames) {
                System.out.println(beanName);
            }
        };
    }
}
