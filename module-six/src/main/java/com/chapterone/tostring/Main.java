package com.chapterone.tostring;

public class Main {
    public static void main(String[] args) {
        HardToReadContact hardToReadContact = new HardToReadContact("John Snow", "The North");
        System.out.println("Hard to read contact: " + hardToReadContact);

        EasyToReadContact easyToReadContact = new EasyToReadContact("John Snow", "The North");
        System.out.println("Easy to read contact: " + easyToReadContact);
    }
}