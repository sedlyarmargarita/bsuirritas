package com.company;

public class Minivan extends PassengerCar {

    public Minivan(){}

    public Minivan(float fuelConsumption, float accelerationTime){
        super(fuelConsumption, accelerationTime);
    }

    @Override
    public void ride() {
        System.out.println("Minivan is riding");
    }

    @Override
    public void printInfo() {
        System.out.println("Fuel consumption - " + getFuelConsumption() + ", Acceleration time - " + getAccelerationTime());
    }
}
