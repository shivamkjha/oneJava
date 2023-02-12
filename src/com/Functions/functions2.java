package com.Functions;

public class functions2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);      //value of a and b won't change coz its pass by value only and in reference variable its pass by reference value.
        System.out.println(swap2(a,b));     //prints num1
        System.out.println(a);



    }

    static void swap(int num1, int num2){
        int temp = num1; //10
        num1 = num2;
        num2 = temp;
        System.out.println(num1+ " "+num2);          //but we can't get this swapped value in main function.
    }

    static int swap2(int num1, int num2){
        int temp = num1; //10
        num1 = num2;
        num2 = temp;
        return num1;
    }



}
