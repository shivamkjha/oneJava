package com.OOPS.Lec2.Pkg2;
import static com.OOPS.Lec2.Pkg1.Greeting.greet;

public class Greeting {
    public static void main(String[] args) {
        greet();
       // greet2();   //you can't import non static method
    }

}
