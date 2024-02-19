package org.example.OCP;

public class Car extends Vechicle {
    public Car(int maxspeed){
        super(maxspeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed(){
        return super.maxspeed * 0.8;
    }
}
