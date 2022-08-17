package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner ( StudentRepository studentRepository) {
        return args -> {
             Student Marian = new Student(1L, "Mariam","juan@juan.com", LocalDate.of(2004, Month.JANUARY, 23));
             Student Juan = new Student(2L, "Juan","juan@juan.com", LocalDate.of(2000, Month.JANUARY, 23));
             studentRepository.saveAll(List.of(Marian, Juan));
        };
        
    }
}
