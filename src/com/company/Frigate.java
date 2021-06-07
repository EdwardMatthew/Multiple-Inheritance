package com.company;

public class Frigate extends Vehicle implements IsSeaVessel {
    public Frigate(int maxSpeed, int maxPassengers, int displacement, String name) {
        super(maxSpeed, maxPassengers, displacement, name);
    }

    @Override
    public int getDisplacement() {
        return displacement;
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        // launch method
    }
}
