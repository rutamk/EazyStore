package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    //    @Autowired
    private final Engine engine;

    @Autowired
    public Vehicle(Engine engine) {
        System.out.println("Vehicle bean constructed by Spring");
        this.engine = engine;
    }

//    public Vehicle() {
//        System.out.println("Vehicle bean constructed by Spring");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello from Component vehicle bean");
    }

    public Engine getEngine() {
        return engine;
    }

//    @Autowired
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void initialize(){
        this.name = "Kia";
    }

}
