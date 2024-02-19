package org.example.DIP;

public class AppDIP {
    public static void main(String[] args) {
        System.out.println("Принцип: Interface Segregation Principle \n");
        Car carPetrolEngine = new Car(new PetrolEngine());
        carPetrolEngine.start();
        Car carDieselEngine = new Car(new DieselEngine());
        carDieselEngine.start();

    }
}
