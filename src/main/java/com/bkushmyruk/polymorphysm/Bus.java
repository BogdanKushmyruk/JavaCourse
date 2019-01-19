package com.bkushmyruk.polymorphysm;

public class Bus implements CarInterface {
    public static final int NUMBER_OF_DOORS = 2;

    @Override
    public void drive() {
        System.out.println("Bus Drive");
    }

    @Override
    public void makeNoise(String noise) {
        System.out.println("Bus " + noise);
    }
}
