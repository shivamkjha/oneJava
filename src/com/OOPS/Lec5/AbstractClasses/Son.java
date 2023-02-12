package com.OOPS.Lec5.AbstractClasses;

public class Son extends Parent{


    public Son(int age) {
        super(age);
    }

//    void normal(){
//        System.out.println("Overriding normal method from abstract class");
//    }


    // all the child classes of an abstract class will have to override all  the abstract methods
    @Override
    void career() {
        System.out.println("I'm going to be a coder");

    }

     @Override
    void partner() {
        System.out.println("I love Paper potts");

    }
}
