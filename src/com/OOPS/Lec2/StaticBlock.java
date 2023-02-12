package com.OOPS.Lec2;

public class StaticBlock {
    static int a=5;
    static int b;

    static{
        System.out.println("This is an static block\n it only runs once");  //no matter how many objects you make
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        System.out.println(a+" "+b);

        StaticBlock obj2 = new StaticBlock();
        a+=3;
        System.out.println(a+" "+b);

        StaticBlock obj3 = new StaticBlock();
        System.out.println(a+" "+b);


    }
}
