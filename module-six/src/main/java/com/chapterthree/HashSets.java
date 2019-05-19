package com.chapterthree;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        Set<Person> myList = new HashSet<>();
        Person aryaStark = new Person("Arya Stark", 12);
        Person johnSnow = new Person("John Snow", 32);
        Person sansaStark = new Person("Sansa Stark", 22);
        Person cerseiLannister = new Person("Cersei Lannister", 28);
        Person euronGreyjoy = new Person("Euron Greyjoy", 36);

        myList.add(aryaStark);
        myList.add(johnSnow);
        myList.add(sansaStark);
        myList.add(new Person("Arya Stark", 12));
        myList.add(cerseiLannister);
        myList.add(euronGreyjoy);
        myList.add(new Person("Arya Stark", 12));

        System.out.println(aryaStark.hashCode());
        System.out.println(johnSnow.hashCode());
        System.out.println(sansaStark.hashCode());
        System.out.println(cerseiLannister.hashCode());
        System.out.println(euronGreyjoy.hashCode());

        System.out.println(myList);
    }
}