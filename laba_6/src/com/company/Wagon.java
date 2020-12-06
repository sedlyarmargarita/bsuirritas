package com.company;
public class Wagon extends PassengerCar {
    public Wagon(){}

    public Wagon(float fuelConsumption, float accelerationTime){
        super(fuelConsumption, accelerationTime);
    }
    @Override
    public void ride() {
        System.out.println("Wagon is riding");
    }

    @Override
    public void printInfo() {
        System.out.println("Fuel consumption - " + getFuelConsumption() + ", Acceleration time - " + getAccelerationTime());
    }
}
