package com.bkushmyruk.polymorphysm;

public final class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bus bus = new Bus();
        car.drive();
        car.makeNoise("beeb");
        bus.drive();
        bus.makeNoise("beeb");

        CarInterface car1 = new Car();
        CarInterface bus1 = new Bus();
        car1.drive();
        car1.makeNoise("beeb");
        bus1.drive();
        bus1.makeNoise("beeb");

        System.out.println(Car.NUMBER_OF_DOORS);
        System.out.println(Car.NUMBER_OF_WHEEL);
        System.out.println(Bus.NUMBER_OF_DOORS);
        System.out.println(Bus.NUMBER_OF_WHEEL);

        interfaceDrive(car1);
        interfaceDrive(bus1);
        interfaceDrive(car);
        interfaceDrive(bus);
        Object o = new Object();
        Object o1 = new Car();

        C c = new C();
        System.out.println(c.toString());
        System.out.println(c.getClass());
        C c1 = new C();
        System.out.println(c.equals(c1));
        System.out.println(c.equals(null));
    }

    public static void interfaceDrive(CarInterface carInterface) {
        carInterface.drive();
    }
}

