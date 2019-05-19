package com.chapterone.hashcode;

public class Main {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 28);
        Person alexAgain = new Person("Alex", 28);
        Person andreea = new Person("Andreea", 18);

        System.out.println("Alex's hashCode: " + alex.hashCode());
        System.out.println("Alex's hashCode again: " + alexAgain.hashCode());
        System.out.println("Andreea's hashCode: " + andreea.hashCode());
    }
}