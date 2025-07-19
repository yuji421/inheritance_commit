class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle{
    void move() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    void move() {
        System.out.println("Bike is running");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Bike()};

        for(Vehicle v : vehicles) {
            v.move();
        }
    }
}
