package com.bkushmyruk.lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer xx = new Integer(5);
        Integer x = 5;
        int y = x;
        x.intValue();
        for (int i = 0; i <= 20; i = i + 2) {
            if (i > 10 & x > 5) {
                continue;
            }
            x++;
            System.out.println(i);
        }
////        for (int i = 0; i <= 20; i = i + 2) {
//            if (i == 10) {
//                break;
//            }
//            System.out.println(i);
//        }

//        int i = 0;
//        while (i <= 20) {
//            System.out.println(i);
//            i += 2;
//        }
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 20);

//        System.out.println(17^23&26|13);
//int a = 073;
// int a = 100;
// int[] b = new int[5];
// a++;
//        System.out.println(++a);
//        int i = a > 10 ? 5 : 6;
//        System.out.println(i);
//        int[] a = new int[5];
//        int[] b = {1, 2, 3, 4, 5};
//
//        for (int i = 0; i < a.length; i++) {
//            a[i] = b[i];
//        }
//        System.out.println(Arrays.toString(a));
//        for (int i = 0; i < a.length; i++) {
//
//            System.out.println(a[i]);
//        }

    }
}
