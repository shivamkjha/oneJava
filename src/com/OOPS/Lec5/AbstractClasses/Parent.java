package com.OOPS.Lec5.AbstractClasses;

public abstract class Parent {
    //Any class having at least one abstract method is called abstract class.
    //can't create objects of this class
    //this could be inherited ,its data members can be accessed by subclasses
    //and its methods can be overridden by subclasses

    int age;

    void normal(){
        System.out.println("this is normal method from abstract class parent");
    }
    static void greeting(){
        System.out.println("Hey I'm in static method inside abstract class :)");
    }

    Parent(int age) {
        this.age = age;
    }

    abstract void career();
    //Abstract methods doesn't have a body
    //mostly made to be overridden by the other classes

    abstract void partner();
}