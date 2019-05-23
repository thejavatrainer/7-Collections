package com.homework;

import com.chapterthree.HashMaps;
import com.chapterthree.Person;

import java.util.*;

/**
 * Exercise 2.
 * Write a program which creates a concordance of characters occurring in a string (i.e., which characters occur where in a string).
 * Read the string from the command line.
 * <p>
 * Running the program:
 * <p>
 * >java Concordance Hello World
 * {d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}
 */

public class Homework2 {
    String string;
   static Map<Character, String> myMap = new HashMap<>();

    public Homework2(String string) {
        this.string = string;
    }

    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Homework2 home = new Homework2(inputString);
        home.getNumberUniqueCharacter();
        System.out.println(myMap);

    }


    public void getNumberUniqueCharacter() {

        List<Character> mysets = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            mysets.add(string.charAt(i));
        }
        while (mysets.size()>0){
            char testChar = mysets.get(0);
            String myMapstring= " "+testChar;
            while (mysets.contains(testChar) ) {
                myMapstring= myMapstring+mysets.indexOf(testChar);
                mysets.remove(mysets.indexOf(testChar));

            }
            myMap.put(testChar,myMapstring);
        }



    }
}
