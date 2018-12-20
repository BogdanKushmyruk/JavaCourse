package com.bkushmyruk.lesson3;

public class Number {
    private static int first;
    private static int second;


    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public static void revers() {
        first = first + second;
        second = first - second;
        first = first - second;
    }


    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}

