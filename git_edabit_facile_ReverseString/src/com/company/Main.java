package com.company;

public class Main {

    public static void main(String[] args) {

        StringBuffer string = new StringBuffer();

        System.out.println(reverseString("Hello World"));
        System.out.println(reverseString("The quick brown fox."));
        System.out.println(reverseString("Edabit is really helpful!"));

    }

    public static String reverseString(String string) {
        StringBuffer stringBuffer = new StringBuffer(string);
        return stringBuffer.reverse().toString();
    }

}
