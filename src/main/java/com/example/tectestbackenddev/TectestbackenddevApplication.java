package com.example.tectestbackenddev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableJpaRepositories(
        basePackages = {
                "com.example.tectestbackenddev.dao",
        })

@EntityScan(
        basePackages = {
            "com.example.tectestbackenddev.entities",
        })

@ComponentScan("com.example.tectestbackenddev")

public class TectestbackenddevApplication
{
    public static void main(String[] args) {

        SpringApplication.run(TectestbackenddevApplication.class, args);
    }

}
