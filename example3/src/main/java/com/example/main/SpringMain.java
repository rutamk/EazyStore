package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
    public static void main(String[] args) {

        /*
        The var keyword was introduced in Java 10. Type inference is used in var keyword in which it detects automatically
        the datatype of a variable based on the surrounding context.
        * */
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle audiVehicle = context.getBean("audiVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + audiVehicle.getName());

        Vehicle hondaVehicle = context.getBean("hondaVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + hondaVehicle.getName());

        Vehicle ferrariVehicle = context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + ferrariVehicle.getName());

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Primary Vehicle name from Spring Context is: " + vehicle.getName());

    }
}
