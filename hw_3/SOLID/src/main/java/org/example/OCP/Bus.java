package org.example.OCP;

public class Bus extends Vechicle {
    public Bus(int maxspeed) {
        super(maxspeed, "Bus");
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.maxspeed * 0.5;
    }
}
