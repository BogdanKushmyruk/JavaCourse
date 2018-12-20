package com.bkushmyruk.lesson3;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.setProduction(2011);
//        System.out.println(car.getEngine());
//        System.out.println(car.getMark());
//        System.out.println(car.getProduction());
//        Car car1 = new Car("BMW", "disel", 1999);
//        System.out.println(car1.getEngine());
//        System.out.println(car1.getMark());
//        System.out.println(car1.getProduction());
//        System.out.println(car);
//        System.out.println(car1);
//        Car car2 = new Car("BMW", "disel");
//        System.out.println(car2.getEngine());
//        System.out.println(car2.getMark());
//        System.out.println(car2.getProduction());
//        Number number = new Number();
//        number.setFirst(10);
//        number.setSecond(5);
//        number.revers();
//        System.out.println(number.getFirst());
//        System.out.println(number.getSecond());


        Point pointA = new Point(11, 22);
        Point pointB = new Point(22, 3);
        Point pointC = new Point(3, 4);
        Triangle triangle = new Triangle();
        Triangle triangle1 = new Triangle(pointA, pointB, pointC);

        triangle.setPointA(pointA);
        triangle.setPointB(pointB);
        triangle.setPointC(pointC);



        TriangleService triangleService = new TriangleService();

        double area = triangleService.countArea(triangle);
        System.out.println(area);


    }


}


