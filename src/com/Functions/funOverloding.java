package com.Functions;

import java.util.Arrays;

public class funOverloding {
    public static void main(String[] args) {

        //2 functions with same name can exist when arguments are different.
        //for this to be possible either number of argument should be different or type of arguments should be different.


        sum(3,5);
        sum(5,8,4);
        fun(3,6,8);
        fun("shiv","shubh");
        //fun();        //ambiguity error

    }

    static void sum(int a, int b){
        System.out.println(a+b);
    }

    static void sum(int a ,int b, int c){
        System.out.println(a+b+c);
    }

    static void fun(int ...i){
        System.out.println(Arrays.toString(i));
    }

    static void fun(String ...i){
        System.out.println(Arrays.toString(i));
    }



}
