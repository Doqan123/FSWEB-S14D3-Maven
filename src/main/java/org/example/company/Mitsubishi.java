package org.example.company;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        return "Mitsubishi car is braking";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi car is accelerating";
    }

    @Override
    public String startEngine() {
        return "Mitsubishi car engine started";
    }
}
