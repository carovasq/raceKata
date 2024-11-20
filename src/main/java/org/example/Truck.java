package org.example;

public class Truck extends Vehicle {
    public Truck(String brand, int wheels) {
        super(brand, wheels);
    }
    public void accelerate() {
        this.velocity += 60;
    }

    public void brake() {
        this.velocity -= 10;
    }
}
