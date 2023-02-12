package com.OOPS.Lec5.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starts Electric engine");
    }

    @Override
    public void stop() {
        System.out.println("Stops Electric engine");

    }

    @Override
    public void acc() {
        System.out.println("Accelerate Electric engine");

    }
}
