package org.example.DIP;

public class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.startEngine();
    }
}
