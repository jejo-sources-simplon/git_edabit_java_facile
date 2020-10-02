package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(nbVowels("Celebration"));
        System.out.println(nbVowels("Prediction"));

        System.out.println();

        System.out.println(nbVowelsConstains("Celebration"));
        System.out.println(nbVowelsConstains("Prediction"));

        System.out.println();

        System.out.println(nbVowelsRegex("Celebration"));
        System.out.println(nbVowelsRegex("Prediction"));

    }

    public static int nbVowelsRegex (String string) {
        return string.replaceAll("[^aeiouAEIUO]", "").length();
    }

    public static int nbVowelsConstains (String string) {
        int nb = 0;
        for (int i=0; i<string.length(); i++) {
            if ("aeiouAEIOU".contains(String.valueOf(string.charAt(i)))) nb++;
        }
        return nb;
    }

    public static int nbVowels (String string) {
        int nb = 0;
        for (int i=0; i<string.length(); i++) {
            switch (string.charAt(i)) {
                case 'a' :
                case 'e' :
                case 'i' :;
                case 'o' :
                case 'u' :
                case 'A' :
                case 'E' :
                case 'I' :;
                case 'O' :
                case 'U' :
                    nb ++;
                    break;
                default :
            }
        }
        return nb;
    }
}
