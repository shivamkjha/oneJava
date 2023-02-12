package com.IfelseConditionals;


import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //Subtract the Product and Sum of Digits of an Integer


//        int n = in.nextInt();234
//        int rem;
//        int sum = 0;
//        int pro = 1;
//
//        while(n!= 0){
//            rem = n%10;
//            sum = sum + rem;
//            pro = pro*rem;
//            n= n/10;
//
//        }
//        System.out.println(pro -sum);


//Input a number and print all the factors of that number (use loops).
//        int n = in.nextInt();
//
//        for (int i = 1; i <= n; i++){
//            if (n%i == 0){
//                System.out.print(" "+ i);
//            }
//        }


        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

//        int count = 0;
//        while(true){
//            int n = in.nextInt();
//            count= count +n;
//            if (n ==0){
//                break;
//            }
//        }
//
//        System.out.println("the sum is "+count);

        //Take integer inputs till the user enters 0 and print the largest number from all.
        int large = 0;
        int count = 0;
        while(true) {
            int n = in.nextInt();
            if (n> large){
                large = n;
            }

            if (n == 0) {
                break;
            }
        }
        System.out.println();








    }
}
