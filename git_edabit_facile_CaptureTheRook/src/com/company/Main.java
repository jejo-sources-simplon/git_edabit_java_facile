package com.company;

public class Main {

    public static void main(String[] args) {

        String[] tbRooks = {"A8", "H8"};
        System.out.println(captureRook(tbRooks));
        tbRooks = new String[] {"A1", "B2"};
        System.out.println(captureRook(tbRooks));
        tbRooks = new String[] {"H4", "H3"};
        System.out.println(captureRook(tbRooks));
        tbRooks = new String[] {"F5", "C8"};
        System.out.println(captureRook(tbRooks));

    }

    public static boolean captureRook (String[] tbRooks) {
        boolean test1 = tbRooks[0].startsWith(tbRooks[1].substring(0,1));
        // System.out.println(tbRooks[0].substring(1,1) + "_" + tbRooks[1].substring(1,1));
        boolean test2 = tbRooks[0].endsWith(tbRooks[1].substring(1));
        return (test1 || test2);
    }
}
