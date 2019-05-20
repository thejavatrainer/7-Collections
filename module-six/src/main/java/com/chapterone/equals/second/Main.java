package com.chapterone.equals.second;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Car andreeasCar = new Car("Honda", "Civic", Year.of(2018), "124");
        Car johnsCar = new Car("Skoda", "Octavia", Year.of(2018), "124");
        Car alexsCar = new Car("Honda", "Civic", Year.of(2018), "146");

        System.out.println("IsSameCar: " + (andreeasCar == johnsCar));
        System.out.println("IsEqualCar: " + (andreeasCar.equals(johnsCar)));

        System.out.println("IsSameCar: " + (andreeasCar == alexsCar));
        System.out.println("IsEqualCar: " + (andreeasCar.equals(alexsCar)));
    }
}