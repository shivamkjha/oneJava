package com.IfelseConditionals;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int j = 1;                                // initialization -> While loop(condtion) -> body(increment)
        while(j<=3){
            System.out.println(j);
            j++;
        }

        for(int i=0;i<3;i++){                      //for (initialization;condition;increment/decrement)
            System.out.println(i+1);
        }

        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        for (int i =0;i<n;i++){
            System.out.println("Hello world "+ i);
        }

        int a = 1;                                  //do while - it gets executed at least once.
        do{
            System.out.println("This code will execute at least once ");
            a++;
        } while(a<3);
    }
}
