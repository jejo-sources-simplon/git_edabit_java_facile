package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] tbInt = {10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println(DiffMaxMin(tbInt));
        tbInt = new int[] {44, 32, 86, 19};
        System.out.println(DiffMaxMin(tbInt));

    }

    public static int DiffMaxMin(int[] tbInt) {
        Arrays.sort(tbInt);
        return tbInt[tbInt.length-1] - tbInt[0];
    }

}
