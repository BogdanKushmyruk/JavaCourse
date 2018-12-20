package com.bkushmyruk.triangle_area;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            println("Введите координаты первой вершины треугольника");
            Point a = readNextPoint(in);
            println("Введите координаты второй вершины треугольника");
            Point b = readNextPoint(in);
            println("Введите координаты третьей вершины треугольника");
            Point c = readNextPoint(in);
            double area = new Triangle(a, b, c).area();
            if (area > 0) {
                println("Площадь заданного треугольника равна " + area);
            } else {
                println("Треугольник не существует");
            }
        }
    }

    private static void println(String s) {
        System.out.println(s);
    }

    private static Point readNextPoint(Scanner in) {
        double x = in.nextDouble();
        double y = in.nextDouble();
        return new Point(x, y);
    }
}

