package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        return "Ford car is braking";  // Markayı (isim) kullanarak döndürüyoruz
    }

    @Override
    public String accelerate() {
        return "Ford car is accelerating";  // Markayı (isim) kullanarak döndürüyoruz
    }

    @Override
    public String startEngine() {
        return "Ford car engine started";  // Markayı (isim) kullanarak döndürüyoruz
    }
}
