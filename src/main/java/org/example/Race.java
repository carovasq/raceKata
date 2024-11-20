package org.example;

import java.util.List;

public class Race {
    List<Vehicle> peloton = List.of(
            new Truck("Merry", 4),
            new Car("Toyota", 4),
            new Motorbike("Darling", 2)
    );

    public void start(){
        System.out.println("3, 2, 1... Starting the race!");
        for (Vehicle vehicle: peloton){
            System.out.printf("%s: %s%n",
                    vehicle.getClass().getSimpleName(), vehicle.getBrand());
            vehicle.accelerate();
            System.out.printf("After acceleration: %s at %d km/h%n",
                    vehicle.getBrand(), vehicle.getVelocity());
            vehicle.brake();
            System.out.printf("After braking: %s at %d km/h%n",
                    vehicle.getBrand(), vehicle.getVelocity());
        }
        System.out.println("Race finished!");
    }
}
