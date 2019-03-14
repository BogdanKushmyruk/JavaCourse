package com.bkushmyruk.fibonaccinumbers;

public class Method2 {
    public long fnc(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (fnc(n - 1) + fnc(n - 2));
        }
    }
}
