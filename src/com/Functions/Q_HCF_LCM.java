package com.Functions;

import java.util.Scanner;

public class Q_HCF_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int hcf = a;
        int lcm = b;

//        //HCF
//        while(true){
//            if(a%hcf==0 && b%hcf ==0){
//                break;
//            }
//            hcf--;
//
//        }
//        System.out.println("\nHCF of Given Two Number = " +hcf);
//        //HCF * LCM = product of two numbers.


        //LCM

        while (true){
            if(lcm%a==0 & lcm%b==0){
                break;
            }
            lcm++;
        }
        System.out.println("\nLCM of Given Two Number = " +lcm);



    }
}
