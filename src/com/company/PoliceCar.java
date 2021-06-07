package com.company;

public class PoliceCar extends Vehicle implements IsLandVehicle, IsEmergency{

    public PoliceCar(String name, int maxPassengers, int maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed, numWheels);
    }

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



    @Override
    public void soundSiren() {
        // sound siren method
    }
}
