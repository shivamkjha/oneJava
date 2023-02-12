package com.Functions;

import java.util.Scanner;

public class Function {

    //MAIN FUNCTION:

    public static void main(String[] args) {
        System.out.println("the sum is "+sum());
        String greet = str();
        System.out.println(greet);
        int y = sum2(5,8);
        System.out.println(y);
        String z = str2(" shiv");
        System.out.println(z);
    }
    /*access modifier (oops) return_type name() {
                //body
                return statement;
    }*/

    //INT FUNCTION

    static int sum(){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        return num1+ num2;
    }
    // passing the values through arguments to a function

    static int sum2(int a , int b){
        int x = a+b;
        return x;

    }

    //STRING FUNCTION

    static String str() {
        String str1 = "Hello world";
        return str1;
    }


    //PASSING AN ARGUMENT TO A STRING FUNCTION

    static String str2(String name){
        String message = "Hello";
        return message + name;

    }



}
