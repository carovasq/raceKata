package org.example;

public class Car extends Vehicle{
    public Car(String brand, int wheels){
        super(brand, wheels);
    }

    public void accelerate() {
        this.velocity += 20;
    }

    public void brake() {
        this.velocity -= 20;
    }
}
