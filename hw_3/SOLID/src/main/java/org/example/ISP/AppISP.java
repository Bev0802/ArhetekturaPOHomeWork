package org.example.ISP;

public class AppISP {
    public static void main(String[] args) {
        System.out.println("Принцип: Interface Segregation Principle \n");
        Circle circle = new Circle(5);

        System.out.println("Perimeter circle: " + circle.perimeter());
        Cube cube = new Cube(5);
        System.out.println("Volume cube: " + cube.volume());
    }
}
