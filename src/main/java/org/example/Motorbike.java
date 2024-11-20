package org.example;

public class Motorbike extends Vehicle{
    public Motorbike(String brand, int wheels) {
        super(brand, wheels);
    }

    public void accelerate() {
        this.velocity += 30;
    }

    public void brake() {
        this.velocity -= 10;
    }
}
