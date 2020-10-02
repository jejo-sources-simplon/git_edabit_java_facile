package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(doubleLetter("loop"));
        System.out.println(doubleLetter("yummy"));
        System.out.println(doubleLetter("orange"));
        System.out.println(doubleLetter("munchkin"));

    }

    public static boolean doubleLetter(String string) {
        for (int i=0; i<string.length()-1; i++) {
            if (string.charAt(i) == string.charAt(i+1)) {
                    return true;
            }
        }
        return false;
    }
}
