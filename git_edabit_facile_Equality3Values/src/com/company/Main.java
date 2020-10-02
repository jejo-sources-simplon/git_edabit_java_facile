package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        System.out.println(nbIntEquals(3, 4, 3));
        System.out.println(nbIntEquals(1, 1, 1));
        System.out.println(nbIntEquals(3, 4, 1));

    }

    public static int nbIntEquals(int int1, int int2, int int3) {
        HashSet<Integer> tbHashInt= new HashSet<Integer>();
        tbHashInt.add(int1);
        tbHashInt.add(int2);
        tbHashInt.add(int3);

        switch (tbHashInt.size()) {
            case 1 : return 3;
            case 2 : return 2;
            case 3 : return 0;
        }
        return -1;
    }

}
