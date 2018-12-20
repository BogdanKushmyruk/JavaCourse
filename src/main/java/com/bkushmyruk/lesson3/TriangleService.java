package com.bkushmyruk.lesson3;

public class TriangleService {

    public double countArea(Triangle triangle) {
        double v1 = triangle.getPointA().getAxisX() - triangle.getPointC().getAxisX();
        double v2 = triangle.getPointB().getAxisY() - triangle.getPointC().getAxisY();
        double v3 = triangle.getPointB().getAxisX() - triangle.getPointC().getAxisX();
        double v4 = triangle.getPointA().getAxisY() - triangle.getPointC().getAxisY();
        return (v1 * v2 - v3 * v4) / 2;
    }

}
