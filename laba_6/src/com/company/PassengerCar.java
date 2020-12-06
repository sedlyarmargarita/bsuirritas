package com.company;
public abstract class PassengerCar implements Car, Object {
    private float fuelConsumption;
    private float accelerationTime;

    public PassengerCar(){}

    public PassengerCar(float fuelConsumption, float accelerationTime){
        this.accelerationTime = accelerationTime;
        this.fuelConsumption = fuelConsumption;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public float getAccelerationTime() {
        return accelerationTime;
    }
}
