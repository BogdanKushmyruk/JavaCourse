package com.bkushmyruk.exceptions;

import com.bkushmyruk.polymorphysm.Car;

import javax.imageio.IIOException;
import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    transient static int x = 6;
    static String[][] String = {{"String"}};

    public final static void main(String[] args) throws SQLException {
//        System.out.println(divine(-5, 0));
        System.out.println("finish");
        System.out.println(String.class);
        float fx = 123.3f;
        String s = "";
        int x = 3;
        System.out.println(x);
        System.out.println(Main.x);
        List<String> list = new ArrayList<>();
        List<String> list1 = new CopyOnWriteArrayList<>();
        List<Car> k = new ArrayList<>();
        list.add("qeeqwe");
        list.add("qeeqwe");
        list.add("qeeqwe");
        list.add("qeeqwe");
        list.add("qeeqwe");
        list.add("qeeqwe");
        list.add("qeeqwe");
        list.add("qeeqwe");
        list.add("qeeqwe");
        list.add("qeeqwe");

        String[] strings = new String[10];



        list.add("qeeqwe");
        list.add("qeeqwe");
        list.add("qeeqwe");
        list.add("qeeqwe");
        System.out.println(list);
    }


    public static int divine(int a, int b) throws MyException {
        try {
            int i = a / b;
            System.out.println(x);
            System.out.println("Step 1");
            System.out.println("Step 2");
            return i;
        } catch (ArithmeticException e) {
            try {
                LineNumberReader reader = new LineNumberReader(new FileReader("C://"));
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
        } finally {
            System.out.println("exit program");
        }
        return 1;
    }
}
