package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        return "Holden car is braking";  // Markayı (isim) kullanarak döndürüyoruz
    }

    @Override
    public String accelerate() {
        return "Holden car is accelerating";  // Markayı (isim) kullanarak döndürüyoruz
    }

    @Override
    public String startEngine() {
        return "Holden car engine started";  // Markayı (isim) kullanarak döndürüyoruz
    }
}
