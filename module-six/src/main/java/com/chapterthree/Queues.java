package com.chapterthree;

import java.util.PriorityQueue;

public class Queues {
    public static void main(String[] args) {
        PriorityQueue<Person> myList = new PriorityQueue<>(new PersonsComparator());
        myList.add(new Person("Arya Stark", 12));
        myList.add(new Person("John Snow", 32));
        myList.add(new Person("Sansa Stark", 22));
        myList.add(new Person("Cersei Lannister", 28));
        myList.add(new Person("Euron Greyjoy", 36));

        System.out.println(myList);
        System.out.println("Get the first element: " + myList.peek());
        System.out.println("List after peek: " + myList);

        System.out.println("First element: " + myList.poll());
        System.out.println("List after poll: " + myList);
    }
}