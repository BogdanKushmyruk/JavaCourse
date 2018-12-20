package com.bkushmyruk.lesson2;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.prnt();
        double sum = Calc.sum(22.2, 3.14);
        System.out.println(sum);
        System.out.println(calc.divide(81.5, 3));
        Calc calc1 = null;
        Calc calc2 = calc;
        Calc calc3 = new Calc();
        System.out.println(calc);
        System.out.println(calc3);
        int a = 2;
        int b = 2;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(calc == calc2);
        System.out.println(calc == calc3);
        System.out.println(calc.variable);
        System.out.println(calc.innerString.concat("d3123123"));

        //static



    }
}
