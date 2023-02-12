package com.OOPS.Lec2;

public class StaticAndNonStatic {
    public static void main(String[] args) {
        // To access the main function (or any function) without an instance or object we need to use static
        staticMethod();
    }
    static void staticMethod(){
        System.out.println("this is static method");
        // nonStaticMethod();
        // can't use nonstatic method in static context

        //coz "nonstatic function requires instance" but static doesn't depend on instance

        //but there's another way to use it ...if we create an instance for the nonstatic method it'll work
        StaticAndNonStatic obj = new StaticAndNonStatic();
        obj.nonStaticMethod();
    }

    void nonStaticMethod(){
        //object for this is needed and needed to use this method
        //staticMethod(); // this can be used :)
        System.out.println("this is non static method");
    }
}
