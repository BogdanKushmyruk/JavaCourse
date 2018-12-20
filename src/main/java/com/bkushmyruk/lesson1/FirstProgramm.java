package com.bkushmyruk.lesson1;

public class FirstProgramm {
    private static byte a;
    private static char a1s = 1000;
    private static boolean ss;

    public static void main(String[] args) {
        byte b = (byte) 128;
        b += 1;
        char c = '1';
        String s = "12";
        long d = 0b10000000000L;
        System.out.println("Hello World!");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(a1s);
        System.out.println(d);

        System.out.println('\u0041');
        System.out.println('\u004F');
        System.out.println('\u003F');

        System.out.println();
        // нулевые символы
        System.out.println('\u0000');
        System.out.println((char) 1);
        System.out.println(a1s);
        System.out.println(ss);
    }
}
