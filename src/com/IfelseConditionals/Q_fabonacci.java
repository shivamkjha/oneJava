package com.IfelseConditionals;

import java.util.Scanner;

public class Q_fabonacci {                //
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count < n){
            int bfre = b;
            b = b+a;
            a = bfre;
            count++;
        }
        System.out.println(b);


    }
}
