package com.OOPS.Lec5.Interfaces;

public class Car implements Engine,Brake, Media {
    //A class implementing an Interface will have to override all its methods

    @Override
    public void brake() {
        System.out.println("brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("Start Engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("Stop Engine like a normal car");

    }

    @Override
    public void acc() {
        System.out.println("Accelerate like a normal car");
    }
    public static void main(String[] args) {
        //2 classes that are unrelated to each other , they can also implement the same interface.
//        CAR
        Car car = new Car();       //Replace Car to engine to see the magic
        car.acc();
        car.brake();
        car.start();
        //so when we call the start method , its present in both MediaPlayer and Engine
        //but it doesn't matter which one is shown coz the body is written in the Car class only .
        //both the start methods are empty
        car.stop();

    }
}
