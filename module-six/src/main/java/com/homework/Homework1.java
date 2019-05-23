/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.homework;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class Homework1 {
    public Homework1(String string) {
        this.string = string;
    }


    /**
     * Exercise 1.
     * Write a method that takes a string and returns the number of unique characters in the string.
     * It is expected that a string with the same character sequence may be passed several times to the method.
     * Since the counting operation can be time consuming, the method should cache the results, so that when the method is given a string previously
     * encountered,it will simply retrieve the stored result.
     * Use collections and maps where appropriate.
     */



    public static void main(String[] args) {
        Map<String, Integer> stingUnique = new Hashtable<>();
        String imput1 = "Read the string from the command line.";
        Homework1 element1 = new Homework1(imput1);

        String imput2 = "Read the string from the command1234 vsDVsdvdsvline.";

        if (((Hashtable<String, Integer>) stingUnique).contains(imput1)) {
            stingUnique.put(imput1,stingUnique.get(imput1));
        }
        Homework1 element2 = new Homework1(imput2);
        Homework1 element3 = new Homework1("imput2m");

        stingUnique.put(imput1, element1.getNumberUniqueCharacter());
        if (((Hashtable<String, Integer>) stingUnique).contains(imput1)) {
            stingUnique.put(imput1,stingUnique.get(imput1));
        }
        System.out.println(stingUnique);

        stingUnique.put(imput2, element2.getNumberUniqueCharacter());
        stingUnique.put(imput1, element1.getNumberUniqueCharacter());
        stingUnique.put(element3.string, element3.getNumberUniqueCharacter());
        System.out.println(stingUnique);


    }

    public String string;

    public int getNumberUniqueCharacter() {

        HashSet<Character> mysets = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            mysets.add(string.charAt(i));
        }

        return mysets.size();

    }


}
