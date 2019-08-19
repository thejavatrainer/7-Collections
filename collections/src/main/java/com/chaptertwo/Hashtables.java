/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.chaptertwo;

import java.util.Hashtable;

public class Hashtables {
    public static void main(String[] args) {
        Hashtable<String, Person> myList = new Hashtable<>();

        myList.put("ID123", new Person("Arya Stark", 12));
        myList.put("ID356", new Person("John Snow", 32));
        myList.put("ID456", new Person("Sansa Stark", 22));
        myList.put("ID346", new Person("Arya Stark", 12));
        myList.put("ID257", new Person("Cersei Lannister", 28));
        myList.put("ID436", new Person("Euron Greyjoy", 36));
        myList.put("ID245", new Person("Arya Stark", 12));

        System.out.println(myList);

        System.out.println("The person with the given ID is: " + myList.get("ID257"));
    }
}
