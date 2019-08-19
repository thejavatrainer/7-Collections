package com.chapterthree;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        myTreeWithIntegers();

        myTreeWithPersons();

        myTreeWithPersonsComparable();
    }

    private static void myTreeWithIntegers() {
        Set<Integer> mySet = new TreeSet<>();
        mySet.add(5);
        mySet.add(89);
        mySet.add(3);
        mySet.add(14);
        mySet.add(43);
        mySet.add(100);
        mySet.add(54);

        System.out.println("My treeSet with integers." + mySet);
    }

    private static void myTreeWithPersons() {
        Set<Person> myPersonsSet = new TreeSet<>();
        myPersonsSet.add(new Person("Arya Stark", 12));
        myPersonsSet.add(new Person("John Snow", 32));
        myPersonsSet.add(new Person("Sansa Stark", 22));
        myPersonsSet.add(new Person("Arya Stark", 12));
        myPersonsSet.add(new Person("Cersei Lannister", 28));
        myPersonsSet.add(new Person("Euron Greyjoy", 36));
        myPersonsSet.add(new Person("Arya Stark", 12));

        System.out.println("My treeSet with persons." + myPersonsSet);
    }

    private static void myTreeWithPersonsComparable() {
        Set<Person> myPersonsSet = new TreeSet<>(new PersonsComparator());
        myPersonsSet.add(new Person("Arya Stark", 12));
        myPersonsSet.add(new Person("John Snow", 32));
        myPersonsSet.add(new Person("Sansa Stark", 22));
        myPersonsSet.add(new Person("Arya Stark", 12));
        myPersonsSet.add(new Person("Cersei Lannister", 28));
        myPersonsSet.add(new Person("Euron Greyjoy", 36));
        myPersonsSet.add(new Person("Arya Stark", 12));

        System.out.println("My treeSet with compared persons." + myPersonsSet);
    }
}