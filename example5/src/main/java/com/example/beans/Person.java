package com.example.beans;

public class Person {
    private String name;
    private Vehicle vehicle;

    public Person() {
        System.out.println("Person bean constructed by Spring");
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
