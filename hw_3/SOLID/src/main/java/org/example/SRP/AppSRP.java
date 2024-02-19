package org.example.SRP;

import org.example.OCP.Bus;
import org.example.OCP.Car;
import org.example.OCP.Vechicle;

public class AppSRP {

    public static void main(String[] args) {
        System.out.println("Принцип: Single Responsability Principle");
        Emploce emploce = new Emploce("Ivan");
        CalculateSalary calculateSalary = new CalculateSalary(1000);
        System.out.println("Name: " + emploce.name + " salary: " + calculateSalary.calculateSalary());
    }

}
