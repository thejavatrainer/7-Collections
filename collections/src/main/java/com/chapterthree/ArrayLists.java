package com.chapterthree;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

        List<Person> myList = new ArrayList<>();
        myList.add(new Person("Arya Stark", 12));
        myList.add(new Person("John Snow", 32));
        myList.add(new Person("Sansa Stark", 22));
        myList.add(new Person("Arya Stark", 12));
        myList.add(new Person("Cersei Lannister", 28));
        myList.add(new Person("Euron Greyjoy", 36));
        myList.add(new Person("Arya Stark", 12));

        System.out.println(myList);
        System.out.println("Get element: " + myList.get(4));
        System.out.println("Get John: " + myList.indexOf(new Person("John Snow", 32)));
        System.out.println("Get John: " + myList.remove(4));
        System.out.println(myList.size());
    }
}