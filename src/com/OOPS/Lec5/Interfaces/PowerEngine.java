package com.OOPS.Lec5.Interfaces;

public class PowerEngine implements Engine{
    //Interface doesn't have objects rather classes implement it and then those classes are used
    //as here we've made Engine class which implementes power engine and will be used by the MyCar
    @Override
    public void start() {
        System.out.println("Starts power engine");
    }

    @Override
    public void stop() {
        System.out.println("Stops power engine");

    }
    @Override
    public void acc() {
        System.out.println("Accelerate power engine");

    }
}
