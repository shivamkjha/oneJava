package com.Functions;

public class shadowing {
    static int x = 10; //this will be shadowed at line 10
    public static void main(String[] args) {
        System.out.println(x); // 10
        int x;      //declaration
        int b = 10;
        //System.out.println(x);  //error
        x = 40;                   //scope will begin after initialization
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);  //the new value of x won't come here coz new value is inside the block inside the block
                                // and the method is inside the class "shadowing" it can access the x = 10;
    }
}
