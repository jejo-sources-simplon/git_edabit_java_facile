package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("###+ => (#,+) " + Arrays.toString(countHashesAndPluses("###+")));
        System.out.println("##+++# =>(#,+) " + Arrays.toString(countHashesAndPluses("##+++#")));
        System.out.println("#+++#+#++# => (#,+) " + Arrays.toString(countHashesAndPluses("#+++#+#++#")));
        System.out.println(" => (#,+) " + Arrays.toString(countHashesAndPluses("")));

    }

    public static int[] countHashesAndPluses(String string) {
        int nbHashes = string.replace("#", "").length();
        int nbPluses = string.replace("+", "").length();
        return new int[] {nbHashes, nbPluses};
    }
}
