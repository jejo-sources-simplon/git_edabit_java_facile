package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(basicCalculator(2, '+', 2));
        System.out.println(basicCalculator(2, '*', 2));
        System.out.println(basicCalculator(4, '/', 2));
        System.out.println(basicCalculator(4, '/', 0));

    }

    public static double basicCalculator(double operande1, char operateur, double operande2) {
        switch (operateur) {
            case '+': return operande1 + operande2;
            case '*': return operande1 * operande2;
            case '/': return (operande2 == 0) ? 0 : operande1 / operande2;
        }
        return 0;
    }
}
