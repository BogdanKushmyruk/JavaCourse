package com.bkushmyruk.polymorphysm;

public interface CarInterface {
    public static final int NUMBER_OF_WHEEL = 4;
    int NUMBER_OF_DOORS = 4;

    public void drive();

    void makeNoise(String noise);
}
