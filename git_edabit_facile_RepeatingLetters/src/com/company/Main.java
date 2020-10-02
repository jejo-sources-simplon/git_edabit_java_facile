package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(repeatLetters("String"));
        System.out.println(repeatLetters("Hello World!"));
        System.out.println(repeatLetters("1234!_ "));

        System.out.println();

        System.out.println(repeatLettersBuffer("String"));
        System.out.println(repeatLettersBuffer("Hello World!"));
        System.out.println(repeatLettersBuffer("1234!_ "));

    }

    public static String repeatLetters (String string) {
        String dblString = "";
        for ( int i=0; i<string.length(); i++) {
            dblString += Character.toString(string.charAt(i)) + Character.toString(string.charAt(i));
        }
        return dblString;
    }

    public static String repeatLettersBuffer (String string) {
        StringBuffer dblBuffer = new StringBuffer();
        for ( int i=0; i<string.length(); i++) {
            dblBuffer.append(string.charAt(i)).append(string.charAt(i));
        }
        return dblBuffer.toString();
    }
}
