package com.bkushmyruk.polymorphysm;

public class Car implements CarInterface{

    @Override
    public void drive() {
        System.out.println("Car Drive");
    }

    @Override
    public void makeNoise(String noise) {
        System.out.println(noise);
    }

}
