package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(endingString("abc", "bc"));
        System.out.println(endingString("abc", "d"));
        System.out.println(endingString("samurai", "zi"));
        System.out.println(endingString("feminine", "nine"));
        System.out.println(endingString("convention", "tio"));
        
    }

    public static boolean endingString(String chaine, String sousChaine) {
        return (chaine.lastIndexOf(sousChaine) == (chaine.length()-sousChaine.length()));
    }
}
