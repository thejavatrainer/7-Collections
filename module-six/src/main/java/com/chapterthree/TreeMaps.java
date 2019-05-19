/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.chapterthree;

import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<Integer, Person> myList = new TreeMap<>();

        myList.put(3, new Person("Arya Stark", 12));
        myList.put(5, new Person("John Snow", 32));
        myList.put(1, new Person("Sansa Stark", 22));
        myList.put(7, new Person("Arya Stark", 12));
        myList.put(2, new Person("Cersei Lannister", 28));
        myList.put(4, new Person("Euron Greyjoy", 36));
        myList.put(8, new Person("Arya Stark", 12));

        System.out.println(myList);

        System.out.println("The person with the given ID is: " + myList.get(4));
    }
}
