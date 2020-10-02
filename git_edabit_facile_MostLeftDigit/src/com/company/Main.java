package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(mostLeftDigit("TrAdE2W1n95!"));
        System.out.println(mostLeftDigit("V3r1ta$"));
        System.out.println(mostLeftDigit("U//DertHe1nflu3nC3"));
        System.out.println(mostLeftDigit("J@v@5cR1PT"));

    }

    public static int mostLeftDigit (String string) {
        char car;
        for (int i=0; i<string.length(); i++) {
            car = string.charAt(i);
            if (Character.isDigit(car)) return Integer.parseInt(Character.toString(car));
        }
        return  0;
    }
}
