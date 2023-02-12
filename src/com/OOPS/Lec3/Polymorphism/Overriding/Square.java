package com.OOPS.Lec3.Polymorphism.Overriding;

import com.OOPS.Lec3.Polymorphism.Overriding.Shapes;

public class Square extends Shapes {
    void Area(){
        System.out.println("I'm in Square");

    }

    //static method can't be overridden as static method doesn't depends on object and overriding depends on object
    static void greeting(){
        System.out.println("This is static from square ");
    }

}
