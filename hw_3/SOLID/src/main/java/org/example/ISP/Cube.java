package org.example.ISP;

public class Cube implements Shape3D {
    int length;

    public Cube(int length) {
        this.length = length;
    }

    @Override
    public double perimeter() {
        return 12 * length;
    }
    @Override
    public double volume() {
        return length * length * length;
    }
}
