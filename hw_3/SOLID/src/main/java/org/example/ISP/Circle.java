package org.example.ISP;

public class Circle implements Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double perimeter() {
        return 2 * radius * Math.PI;
    }

}
