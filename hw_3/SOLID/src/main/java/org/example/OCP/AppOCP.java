package org.example.OCP;

public class AppOCP {
    public static void main(String[] args) {
        System.out.println("Принцип: Open-Closed Principle");
        Vechicle vechicle = new Vechicle(300, "Train");
        printVechicleMaxSpeed(vechicle);
        //vechicle = new Car(200);
        printVechicleMaxSpeed(new Car(200));
        vechicle = new Bus(100);
        printVechicleMaxSpeed(vechicle);


    }
    public static void printVechicleMaxSpeed(Vechicle vechicle){
        System.out.println(vechicle.type + " max speed: -> " + vechicle.calculateAllowedSpeed());

    }
}