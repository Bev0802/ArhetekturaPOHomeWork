package org.example.DIP;

public class PetrolEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("Petrol engine started");
    }
}
