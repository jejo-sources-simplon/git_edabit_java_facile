package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(nbXsOsRegex("ooxx"));
        System.out.println(nbXsOsRegex("xooxx"));
        System.out.println(nbXsOsRegex("ooxXm"));
        System.out.println(nbXsOsRegex("zpzpzpp"));
        System.out.println(nbXsOsRegex("zzoo"));

        System.out.println();

        System.out.println(nbXsOsContains("ooxx"));
        System.out.println(nbXsOsContains("xooxx"));
        System.out.println(nbXsOsContains("ooxXm"));
        System.out.println(nbXsOsContains("zpzpzpp"));
        System.out.println(nbXsOsContains("zzoo"));
    }

    public static boolean nbXsOsRegex (String string) {
        int nb = 0;
        String string1 = string;

        string = string.replaceAll("[^xX]", "");
        string1 = string1.replaceAll("[^oO]", "");
        return  (string.length() == string1.length());
    }

    public static boolean nbXsOsContains (String string) {
        int nbX = 0;
        int nbO = 0;

        for (int i=0; i<string.length(); i++) {
            if ("xX".contains(String.valueOf(string.charAt(i)))) nbX++;
            if ("oO".contains(String.valueOf(string.charAt(i)))) nbO++;
        }
        return (nbX == nbO);
    }

}
