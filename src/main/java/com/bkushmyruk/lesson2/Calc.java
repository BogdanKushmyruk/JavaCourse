package com.bkushmyruk.lesson2;

public class Calc {
    public static int count;
    public static int variable = 5;
    public String innerString = "Hello";

    public static double sum(double number1, double number2) {
        return number1 + number2;
    }

    public double odds(double number1, double number2) {
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public double divide(double number1, double number2) {
        return number1 / number2;
    }

    public static void prnt() {
        System.out.println("It's calc class");
        System.out.println();

    }
    public void overflow() {
        count++;
        System.out.println(count);
        overflow();
    }
}
