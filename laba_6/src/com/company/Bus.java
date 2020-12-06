package com.company;

public class Bus extends Object implements Car {
    private int numberOfSeats;
    public Bus(){}

    public Bus(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void ride() {
        System.out.println("Bus is riding");
    }

    @Override
    public void printInfo() {
        System.out.println("Number of seats - " + numberOfSeats);
    }
}
