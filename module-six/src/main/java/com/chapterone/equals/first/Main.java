package com.chapterone.equals.first;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Car andreeasCar = new Car("Honda", "Civic", Year.of(2018));
        Car johnsCar = new Car("Honda", "Civic", Year.of(2018));
        Car alexsCar = new Car("Honda", "Civic", Year.of(2019));

        System.out.println("IsSameCar: " + (andreeasCar == johnsCar));
        System.out.println("IsSameCar: " + (andreeasCar != alexsCar));
        System.out.println("IsSameCar: " + (andreeasCar != johnsCar));

        System.out.println("IsEqualCar: " + (andreeasCar.equals(johnsCar)));
    }
}