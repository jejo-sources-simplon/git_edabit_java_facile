package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intPhoneNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(phoneNumberFormating1(intPhoneNumbers));
        intPhoneNumbers = new int[] {5, 1, 9, 5, 5, 5, 4, 4, 6, 8};
        System.out.println(phoneNumberFormating1(intPhoneNumbers));
        intPhoneNumbers = new int[] {3, 4, 5, 5, 0, 1, 2, 5, 2, 7};
        System.out.println(phoneNumberFormating1(intPhoneNumbers));

        System.out.println();

        intPhoneNumbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(phoneNumberFormating2(intPhoneNumbers));
        intPhoneNumbers = new int[] {5, 1, 9, 5, 5, 5, 4, 4, 6, 8};
        System.out.println(phoneNumberFormating2(intPhoneNumbers));
        intPhoneNumbers = new int[] {3, 4, 5, 5, 0, 1, 2, 5, 2, 7};
        System.out.println(phoneNumberFormating2(intPhoneNumbers));

    }

    public static String phoneNumberFormating1(int[] intPhoneNumbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", intPhoneNumbers[0], intPhoneNumbers[1], intPhoneNumbers[2], intPhoneNumbers[3],
                intPhoneNumbers[4], intPhoneNumbers[5], intPhoneNumbers[6], intPhoneNumbers[7], intPhoneNumbers[8], intPhoneNumbers[9]);
    }

    public static String phoneNumberFormating2(int[] intPhoneNumbers) {
        StringBuffer phoneNumbers = new StringBuffer();

        for (int i : intPhoneNumbers) phoneNumbers.append(i);
        phoneNumbers.insert(0, "(");
        phoneNumbers.insert(4, ")");
        phoneNumbers.insert(5, " ");
        phoneNumbers.insert(10, "-");
        return phoneNumbers.toString();
    }
}
