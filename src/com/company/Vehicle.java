package com.company;

public abstract class Vehicle {
    protected String name;
    protected int maxPassengers;
    protected int maxSpeed;
    protected int numWheels;
    protected int displacement;

    public Vehicle(String name, int maxPassengers, int maxSpeed, int numWheels, int displacement) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
        this.displacement = displacement;
    }

    public Vehicle(int maxSpeed, int maxPassengers, int displacement, String name) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.displacement = displacement;
    }

    public Vehicle(String name, int maxPassengers, int maxSpeed, int numWheels) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.maxPassengers = maxPassengers;
        this.numWheels = numWheels;
    }
}
