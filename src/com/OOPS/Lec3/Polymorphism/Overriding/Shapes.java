package com.OOPS.Lec3.Polymorphism.Overriding;

public class Shapes {
    void Area(){
        System.out.println("I'm in Shape");
    }

    void Area(String name){
        System.out.println("I'm in Shape");
    }

    // The above 2 are example of Method Overloading


//    final void Area(){
//        System.out.println("I'm in Shape");
//    }

    //In the above code method is final so we can't override it coz we can't re assign it


    // static method
    static void greeting(){
        System.out.println("This is static from Shape ");
    }

}
