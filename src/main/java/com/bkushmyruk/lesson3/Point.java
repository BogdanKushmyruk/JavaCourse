package com.bkushmyruk.lesson3;

public class Point {
    private double axisX;
    private double axisY;

    public Point(double axisX, double axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    public void setAxisX(double axisX) {
        this.axisX = axisX;
    }

    public void setAxisY(double axisY) {
        this.axisY = axisY;
    }

    public double getAxisX() {
        return axisX;
    }

    public double getAxisY() {
        return axisY;
    }
}
