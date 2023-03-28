package com.github.piotrselak.blog.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostConfig {
    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Hello World");
        };
    }
}
