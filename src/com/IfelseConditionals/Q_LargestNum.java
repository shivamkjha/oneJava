package com.IfelseConditionals;

import java.util.Scanner;

public class Q_LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Q1.Find the largest of the 3 numbers
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        //assuming b is maximum
//        int max = b;
//
//        if (a > max) {
//            max = a;
//        } else if (c > max) {
//            max = c;
//        }
//        System.out.println("the maximum is "+max);


//         Q2.Check lower or upper case.
        int i =0;
        while(i == 0){
            char ch = in.next().trim().charAt(0);
            if(ch >= 'a' && ch<= 'z'){
                System.out.println("Lowercase");
            }else{
                System.out.println("Uppercase");
            }
        }





    }
}
