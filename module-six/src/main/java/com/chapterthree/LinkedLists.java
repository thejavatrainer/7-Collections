package com.chapterthree;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Person> myList = new LinkedList<>();
        myList.add(new Person("Arya Stark", 12));
        myList.add(new Person("John Snow", 32));
        myList.add(new Person("Sansa Stark", 22));
        myList.add(new Person("Cersei Lannister", 28));
        myList.add(new Person("Euron Greyjoy", 36));

        myList.offerFirst(new Person("Andreea Chiscari", 18));
        myList.offerLast(new Person("Alex Chiscari", 33));

        System.out.println(myList);
        System.out.println("Get the first element: " + myList.getFirst());
        System.out.println("List after get: " + myList);

        System.out.println("First element: " + myList.peekFirst());
        System.out.println("List after poll: " + myList);

        System.out.println("First element: " + myList.pollFirst());
        System.out.println("List after poll: " + myList);
    }
}