package com.bkushmyruk.lesson3;

public class Car {
    private String mark;
    private String engine;
    private int production;
    private int price;


    public String getMark() {
        return mark;
    }

    public void hhhhh(String ark) {
        this.mark = ark;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) {
        this.production = production;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car() {

    }

    public Car(String mark, String engine) {
        this.mark = mark;
        this.engine = engine;

    }

    public Car(String mark, String engine, int production) {
        this.mark = mark;
        this.engine = engine;
        this.production = production;
    }

    public Car(String mark, String engine, int production, int price, int k) {
        this.mark = mark;
        this.engine = engine;
        this.production = production;
        this.price = price * k;
    }


}
