/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.chapterfour;

import com.chapterthree.Person;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {
        List<Person> myList = createList();

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Simple for: The person is:" + myList.get(i));
        }

        for (Iterator<Person> it = myList.iterator(); it.hasNext(); ) {
            Person person = it.next();
            System.out.println("Iterator: The person is:" + person);
            if (person.getAge() < 18) {
                it.remove();
            }
        }

        for (Person aMyList : myList) {
            System.out.println("Foreach: The person is:" + aMyList);
        }
    }

    private static List<Person> createList() {
        List<Person> myList = new ArrayList<>();
        myList.add(new Person("Arya Stark", 12));
        myList.add(new Person("John Snow", 32));
        myList.add(new Person("Sansa Stark", 22));
        myList.add(new Person("Arya Stark", 12));
        myList.add(new Person("Cersei Lannister", 28));
        myList.add(new Person("Euron Greyjoy", 36));
        myList.add(new Person("Arya Stark", 12));
        return myList;
    }
}
