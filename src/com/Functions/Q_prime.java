package com.Functions;

import java.util.Scanner;

public class Q_prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(ArmNum(n));
        System.out.println("Following are the 3 digit armstrong numbers: ");


        for ( int i = 100; i<1000;i++){
            if(ArmNum(i)){
                System.out.println(i);
            }
        }
    }

    //Q1. write a function to check for prime number
//    static boolean prime(int n){
//        int count =0;
//
//        if (n>1){
//            for(int i =2;i<=n;i++){
//                if (n%i ==0){
//                    count+=1;
//                }
//            }
//        }
//        else{
//            return false;
//        }
//     return count ==1;
//    }

    //Q2. write a programme to get all 3 digit armstrong numbers 1  5   3

    static boolean ArmNum(int n){
        int sumCube = 0;
        int orgN = n;

        for (int i =0;n>0;i++){
            int digit =n%10;
            sumCube = sumCube + digit*digit*digit;
            n = n/10;
        }

        return sumCube == orgN;
    }
}
