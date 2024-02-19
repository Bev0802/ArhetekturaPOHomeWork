package org.example.OCP;

public class Vechicle {

    public int maxspeed;
    public String type;

    public Vechicle(int maxspeed, String type) {
        this.maxspeed = maxspeed;
        this.type = type;
    }

    public double calculateAllowedSpeed(){
        return maxspeed;

    }
}
