package com.chapterthree;

import java.util.List;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        List<Person> myList = new Vector<>();
        myList.add(new Person("Arya Stark", 12));
        myList.add(new Person("John Snow", 32));
        myList.add(new Person("Sansa Stark", 22));
        myList.add(new Person("Cersei Lannister", 28));
        myList.add(new Person("Euron Greyjoy", 36));

        System.out.println(myList);
    }
}