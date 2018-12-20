package com.bkushmyruk.triangle_area;

public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double area = -1;

    public double area() {
        if (area == -1) {
            double ab = a.distanceTo(b);
            double bc = b.distanceTo(c);
            double ac = a.distanceTo(c);
            double p = (ab + bc + ac) / 2;
            area = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return area;
    }
}
