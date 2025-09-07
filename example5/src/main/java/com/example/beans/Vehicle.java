package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

public class Vehicle {
    private String name;

    public Vehicle() {
        System.out.println("Vehicle bean constructed by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello from Component vehicle bean");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

}
