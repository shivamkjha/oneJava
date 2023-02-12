package com.Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,5,66,99);
        multiple(2,3,"shiv","shubh");

    }

    static void fun(int ...i){                      //automatically makes an array
        System.out.println(Arrays.toString(i));
    }

    static void multiple( int a , int b, String...s){
    }


}
