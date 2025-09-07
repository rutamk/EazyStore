package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Tesla");
        return vehicle;
    }

    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    Integer number(){
        return 16;
    }
}
