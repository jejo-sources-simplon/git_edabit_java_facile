package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(shuffleName("Donald Trump"));
        System.out.println(shuffleName("Rosie O'Donnell"));
        System.out.println(shuffleName("Seymour Butts"));
        
    }

    public static String shuffleName (String name) {
        String[] tbName = name.split(" ");
        return (tbName[1] + " " + tbName[0]);
    }
}
