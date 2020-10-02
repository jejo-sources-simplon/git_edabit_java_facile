package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        boolean[] tb1 = {true, false, false, true, false};
        System.out.println(countTrue(tb1));

        boolean[] tb2 = {false, false, false, false};
        System.out.println(countTrue(tb2));

        boolean[] tb3 = {};
        System.out.println(countTrue(tb3));

    }

    public static int countTrue(boolean[] tbBoolean){
        int nbTrue = 0;
        for (boolean b : tbBoolean){
            if (b == true) nbTrue++;
        }
        return nbTrue;
    }
}

