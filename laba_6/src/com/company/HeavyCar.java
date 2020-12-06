package com.company;

public class HeavyCar  implements Car, Object {
    private float carrying;
    private Enums.bodyType bodyType;

    public HeavyCar(){}

    public HeavyCar(float carrying, Enums.bodyType bodyType){
        this.bodyType = bodyType;
        this.carrying = carrying;
    }

    public float getCarrying() {
        return carrying;
    }

    public Enums.bodyType getBodyType() {
        return bodyType;
    }

    @Override
    public void ride() {
        System.out.println("Heavy car is riding");
    }

    @Override
    public void printInfo() {
        System.out.println("Carrying - " + carrying + ", Body type - " + bodyType);
    }
}
