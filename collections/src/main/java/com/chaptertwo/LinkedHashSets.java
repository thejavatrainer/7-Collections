package com.chaptertwo;

import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<Person> myList = new LinkedHashSet<>();
        myList.add(new Person("Arya Stark", 12));
        myList.add(new Person("John Snow", 32));
        myList.add(new Person("Sansa Stark", 22));
        myList.add(new Person("Arya Stark", 12));
        myList.add(new Person("Cersei Lannister", 28));
        myList.add(new Person("Euron Greyjoy", 36));
        myList.add(new Person("Arya Stark", 12));

        System.out.println(myList);
    }
}