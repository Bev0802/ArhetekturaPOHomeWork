package org.example.LSP;

public class Rectangle extends QuadRangle {
    public double height;
    public double width;
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    @Override
    double area() {
        return height * width;
    }
}
