package com.company;

public class Jeep extends Vehicle implements IsLandVehicle {
    @Override
    public int getNumWheels() {
        return numWheels;
    }


    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }


    @Override
    public void drive() {
        // drive method
    }

    public Jeep(String name, int maxPassengers, int maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed, numWheels);
    }
}
