/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.chapterthree;

import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<Person, String> personMap = new TreeMap<>();

        personMap.put(new Person("Arya Stark", 12), "Chocolate");
        personMap.put(new Person("John Snow", 32), "Candy");

        System.out.println(personMap);
    }
}
