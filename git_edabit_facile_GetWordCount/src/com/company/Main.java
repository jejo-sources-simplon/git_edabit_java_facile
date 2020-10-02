package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(coutWord("Just an example here move along"));
        System.out.println(coutWord("This is a test"));

    }

    public static int coutWord(String phrase){
        String[] tbMots;
        tbMots = phrase.split(" ");
        return tbMots.length;
    }
}
