package com.bkushmyruk.fibonaccinumbers;

public class Method1 {
    private long firstNumber = 0;
    private long secondNumber = 0;
    private long temporaryNumber = 1;

    public long fnc(int n) {

        for (int i = 0; i < n; i++) {
            firstNumber = secondNumber;
            secondNumber = temporaryNumber;
            temporaryNumber = firstNumber + secondNumber;
        }
        return secondNumber;
    }
}
