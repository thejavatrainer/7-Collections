package com.chapterfour;

import com.chapterthree.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExamples {
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
        Collections.sort(myList);
        Person min = Collections.max(myList);
        Collections.shuffle(myList);
        System.out.println(myList);

        Collections.shuffle(myList);
    }
}