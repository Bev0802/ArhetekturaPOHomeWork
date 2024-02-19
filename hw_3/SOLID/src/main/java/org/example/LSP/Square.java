package org.example.LSP;

public class Square extends QuadRangle {
    int length;
    public Square(int length) {
        this.length = length;
    }
    @Override
    double area() {
        return length*length;
    }
}
