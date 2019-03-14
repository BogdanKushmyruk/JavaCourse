package com.bkushmyruk.fibonaccinumbers;

public class Resulte {
    public static void main(String[] args) {
        Method1 cycle = new Method1();
        Method2 recursion = new Method2();
        System.out.println(cycle.fnc(20));
        long start = System.nanoTime();
        System.out.println(start);
        System.out.println(recursion.fnc(20));
        System.out.println(System.nanoTime()-start);

    }
}
