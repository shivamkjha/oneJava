package com.OOPS.Lec3.Polymorphism.Overloading;

import com.OOPS.Lec3.Polymorphism.Overloading.MethodOverloading;

public class Run {
    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        System.out.println(m1.sum(2, 5));
        System.out.println(m1.sum(5, 8, 8));
    }

}
