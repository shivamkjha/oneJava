package com.OOPS.Lec1;

public class WrapperClass {
    public static void main(String[] args) {
        //a and b are primitives
        int a = 5;
        int b = 10;
        int c = a;

//      a1 and a2 are objects of class integer it can't be modified coz its final class
        Integer a1 = 45;
        Integer a2 = 55;


//      the value of a and b will only change inside the swap function
        swap1(a,b);

        //the values of a and b won't change as it swap is only
        //..taking the value of variables a and b not its reference.
        System.out.println(a+" "+b);
    }
    static void swap1(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a+" b = "+b);
    }

}
