package com.alisonanderson.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {

            Student alison = new Student(

                        "Alison",
                        "alison@alisonanderson.net",
                        LocalDate.of(1981, MARCH, 5)
            );
            Student owen = new Student(

                    "Owen",
                    "owen@alisonanderson.net",
                    LocalDate.of(2015, MARCH, 15)
            );
            Student test = new Student(

                    "Test",
                    "owen@alisonanderson.net",
                    LocalDate.of(2015, MARCH, 15)
            );
            studentRepository.saveAll(
                    List.of(alison, owen, test)
            );
        };
    }

}
