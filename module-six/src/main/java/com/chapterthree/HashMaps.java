/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.chapterthree;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map<String, Person> personMap = new HashMap<>();

        personMap.put("ID123", new Person("Arya Stark", 12));
        personMap.put("ID356", new Person("John Snow", 32));
        personMap.put("ID456", new Person("Sansa Stark", 22));
        personMap.put("ID346", new Person("Arya Stark", 12));
        personMap.put("ID257", new Person("Cersei Lannister", 28));
        personMap.put("ID436", new Person("Euron Greyjoy", 36));
        personMap.put("ID245", new Person("Arya Stark", 12));

        System.out.println(personMap);

        System.out.println("The person with the given ID is: " + personMap.containsKey("ID257"));
    }
}
