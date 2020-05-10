package com.company;

public class CarFactory {
    public Car getcar(String car) {
        if (car == null) {
            return null;
        }
        if (car.equalsIgnoreCase("1")) {
            return new Bmw();

        } else if (car.equalsIgnoreCase("2")) {
            return new Benz();

        } else if (car.equalsIgnoreCase("3")) {
            return new Saipa();
        }
        return null;
    }
}
