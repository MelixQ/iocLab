package ru.kuznetsovMD.iocLab.task22;

public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public String drive() {
        return engine.start() + "=== CAR IS DRIVING!";
    }
}
